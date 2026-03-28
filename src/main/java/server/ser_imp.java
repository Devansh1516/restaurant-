package server;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import dao.res_dao;
import hiber.input;
import hiber.reservation_sta;

@Service
@Repository
public class ser_imp implements re_ser {
	

	private res_dao dao;
	@Autowired
	public ser_imp(res_dao dao) {
		this.dao=dao;
	}

	@Override
	public void save(input obj ) {
		if(obj.getPeople()<=8) {
			obj.setStatus(reservation_sta.PENDING);
			dao.save(obj);
		}
		else {
			System.out.println("comvert it to the party ");
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<input> getAllInputs() {
		// TODO Auto-generated method stub
		return dao.getpending();}

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
				dao.updateinput(obj);
				
				
		}
		
	}
	public void rejectReservation(int id) {
		input obj=dao.getInputById(id);
		if(obj!=null) {
			obj.setStatus(reservation_sta.REJECTED);
			dao.updateinput(obj);
			
		}
	}


@Override
public List<input> findbynumber(int numb) {
			return dao.findbynumber(numb);
		}	
}
