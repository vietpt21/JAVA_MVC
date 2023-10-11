package vietpt.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vietpt.entity.DatasourceClother;
import vietpt.entity.GiamDoc;
import vietpt.entity.Lop;
import vietpt.entity.NhanVien;
import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
  public String Trangchu(ModelMap modelMap){
        ApplicationContext  context = new ClassPathXmlApplicationContext("IoC.xml");
        DatasourceClother clother = (DatasourceClother) context.getBean("dataclother");
        List<Lop> lstLop = clother.getlop();
        modelMap.addAttribute("listl",lstLop);
        return "home";

    }


}
