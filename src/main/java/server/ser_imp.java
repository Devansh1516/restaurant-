package server;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import dao.res_dao;
import hiber.input;
import hiber.reservation_sta;

@Service
@Repository
public class ser_imp implements re_ser {
	

private Map<Integer,input> reservationcache=new ConcurrentHashMap<>();
	private res_dao dao;
	@Autowired
	public ser_imp(res_dao dao) {
		this.dao=dao;
	}

	@Override
	public void save(input obj ) {
		if(obj.getPeople()<=8) {
			obj.setStatus(reservation_sta.PENDING);
			reservationcache.put(obj.getId(), obj);
		}
		else {
			System.out.println("comvert it to the party ");
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<input> getAllInputs() {
		// TODO Auto-generated method stub
		return new ArrayList<>(reservationcache.values());
	}

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
		input obj=reservationcache.get(id);
		
			if(obj!=null) {
				obj.setStatus(reservation_sta.APPROVED);
				dao.save(obj);
				reservationcache.remove(id);
				
		}
		
	}
	public void rejectReservation(int id) {
		input obj=reservationcache.get(id);
		if(obj!=null) {
			obj.setStatus(reservation_sta.REJECTED);
			dao.save(obj);
			reservationcache.remove(id);
		}
	}


@Override
public List<input> findbynumber(int numb) {
	// TODO Auto-generated method stub
	return null;
}

	

}
