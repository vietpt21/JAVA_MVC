package vietpt.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vietpt.entity.GiamDoc;
import vietpt.entity.NhanVien;

@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
   public static String Trangchu(){
       ApplicationContext context =new ClassPathXmlApplicationContext("IoC.xml");
       NhanVien nhanVien= (NhanVien) context.getBean("nhanvien");
        // nhanVien.getThongBao();
      //  ((ClassPathXmlApplicationContext)context).close();
      //  System.out.println(nhanVien.getDoc().getTen() + "  "+ nhanVien.getDoc().getTuoi()+ "  "+nhanVien.getDoc().getChucvu());
      for (String a : nhanVien.getList()){
          System.out.println(a);
      }
       return "nfhsaf";
   }
    @RequestMapping("/logout")
    @ResponseBody
   public static String logout(){
        ApplicationContext context =new ClassPathXmlApplicationContext("IoC.xml");
       ((ClassPathXmlApplicationContext)context).close();
       return "gslalfa";
   }
}
