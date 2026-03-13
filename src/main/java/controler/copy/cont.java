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

import hiber.input;
import server.ser_imp;

@RestController
public class cont {
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
		return service.getAllInputs();
		
	}
	@GetMapping("/approve")
	public String approve(@RequestParam int id)
	{
		service.approveResevation(id);
		return "adminDashboard";
	}
	@GetMapping("/reject")
	public String reject(@RequestParam int id) {
		service.rejectReservation(id);
		return "adminDashboard";
	}
	
}

