package controler.copy;


import hiber.input;
import server.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controleareg {

    @Autowired
    private ser_imp service;

    @GetMapping("/getbynumber")
    public List<input> checkbynumber(@RequestParam int number) {
      List<input> list= service.findbynumber(number);
      System.out.println(list);
    	return list;
    	//return service.findbynumber(number);
    }
}