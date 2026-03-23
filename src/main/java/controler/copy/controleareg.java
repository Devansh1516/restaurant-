package controler.copy;


import hiber.input;
import server.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controleareg {
	@Autowired
	private ser_imp service;
	@GetMapping("/getbynumber")
	public String checkbynumber(@RequestParam int phone , org.springframework.ui.Model modal) {
		java.util.List<input> list= service.findbynumber(phone);{
			modal.addAttribute("Reservation",list);
		}
		
		return "Status";
		
	}
}
