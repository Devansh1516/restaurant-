package controler.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@GetMapping("/location")
	public String location() {

	    return "map";

	} 
	@GetMapping("all")
	public String adminall(Model mo) {
		List<input> list = service.getAllInputs();

		
		mo.addAttribute("list", list);

		return "adminall";
		
	}
	@GetMapping("/delete")
	public String delete(@RequestParam int id){

	    service.deleteinput(id);

	    return "adminall";
}
	@GetMapping("/update")
public String updatePage(@RequestParam int id, Model model){

    input obj = service.getInputById(id);

    model.addAttribute("reservation", obj);

    return "update";

}
	
}

