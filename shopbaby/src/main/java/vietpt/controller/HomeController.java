package vietpt.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vietpt.entity.NhanVien;

@Controller
public class HomeController {
	@RequestMapping("/")
	@ResponseBody
	public static String index() {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		NhanVien nv = (NhanVien) context.getBean("nhanvien");
		nv.getInfomation();
		return "homesfsd";
	}

	@RequestMapping("/login")
	@ResponseBody
	public static String login() {
		return "loginxzczxczx";
	}

}
