package controler.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dao.res_dao;
import dao.res_imp;
import hiber.input;
import server.ser_imp;

@RestController
public class cont {
	private res_dao dao;
	@Autowired
 private ser_imp service;
	@PostMapping("/reserve")
	public String reserve(@RequestBody input obj) {
		service.save(obj);
		return "reservation created successfully";
	}
	@GetMapping("/pending")
	@ResponseBody
	public List<input>getPendingReservation(){
		return service.getpending() ;
		
	}
	@GetMapping("/approve")
	public String approve(@RequestParam int tempid)
	{
		service.approveResevation(tempid);
		return "adminDashboard";
	}
	@GetMapping("/reject")
	public String reject(@RequestParam int tempid) {
		service.rejectReservation(tempid);
		return "adminDashboard";
	}
	
 
		 
}

