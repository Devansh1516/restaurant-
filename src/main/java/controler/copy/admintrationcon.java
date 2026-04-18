package controler.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hiber.input;
import server.ser_imp;
@Controller
public class admintrationcon {
	@Autowired
	private ser_imp service;
	private hiber.input in;
	@GetMapping("/admin")
	public String showadmin(Model mo) {
		System.out.println("ADMIN HIT");
		List<input> list=service.getpending();
		 System.out.println("ADMIN DATA: " + list); // 
		mo.addAttribute("list",list);
		return "adminstatus";
	}
	@GetMapping("/home")
	public String home() {
	    return "index";
	}

	@GetMapping("/register")
	public String register() {
	    return "register";
	}

	@GetMapping("/check")
	public String check() {
	    return "check";
	}
		 
}

