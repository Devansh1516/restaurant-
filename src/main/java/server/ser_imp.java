package server;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.w3c.dom.css.Counter;

import dao.res_dao;
import hiber.input;
import hiber.reservation_sta;

@Service
public class ser_imp implements re_ser {
	
	private List<input> pendingCache=new ArrayList<>();
	

	private res_dao dao;
	@Autowired
	public ser_imp(res_dao dao) {
		this.dao=dao;
	}

	@Override
	public void save(input obj ) {
		if(obj.getPeople()<=8) {
			obj.setStatus(reservation_sta.PENDING);
			pendingCache.add(obj);
		}
		else {
			System.out.println("comvert it to the party ");
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<input> getAllInputs() {
		// TODO Auto-generated method stub
		return dao.getAllInputs();}

	@Override
	public input getInputById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateinput(input obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteinput(int id) {
		// TODO Auto-generated method stub
		
	}
	public void approveResevation(int id) {
		input obj=dao.getInputById(id);
		
			if(obj!=null) {
				obj.setStatus(reservation_sta.APPROVED);
				dao.save(obj);
				pendingCache.remove(id);
				
				
		}
		
	}
	public void rejectReservation(int id) {
		input obj=dao.getInputById(id);
		if(obj!=null) {
			obj.setStatus(reservation_sta.REJECTED);
			pendingCache.remove(id);
			dao.save(obj);
			
		}
	}


@Override
public List<input> findbynumber(int numb) {
			return dao.findbynumber(numb);
		}	
@Override
public List<input> getpending(){
	return pendingCache;
}
}






