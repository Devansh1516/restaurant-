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
	private Map<Integer, input> pendingCache=new ConcurrentHashMap<>();
	private AtomicInteger count=new AtomicInteger();
	

	private res_dao dao;
	@Autowired
	public ser_imp(res_dao dao) {
		this.dao=dao;
	}

	@Override
	public void save(input obj ) {
		if(obj.getPeople()<=8) {
			int tempid=count.getAndIncrement();
			obj.setTempId(tempid);
			obj.setStatus(reservation_sta.PENDING);
			pendingCache.put(tempid,obj);
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
	public void approveResevation( int tempid) {
	
		input obj=pendingCache.get(tempid);
		
			if(obj!=null) {
				obj.setStatus(reservation_sta.APPROVED);
				dao.save(obj);
				pendingCache.remove(tempid);
				
				
		}
		
	}
	public void rejectReservation(int tempid) {
		input obj=pendingCache.get(tempid);
		if(obj!=null) {
			obj.setStatus(reservation_sta.REJECTED);
			pendingCache.remove(tempid);
			dao.save(obj);
			
		}
	}


@Override
public List<input> findbynumber(int numb) {
			return dao.findbynumber(numb);
		}	
@Override
public List<input> getpending(){
	return new ArrayList<>(pendingCache.values());
}
}






