package vietpt.controller;


import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/" )
public class HomeController {
	@GetMapping
	@Transactional
	public String index(){

		return "login";
	}
}
