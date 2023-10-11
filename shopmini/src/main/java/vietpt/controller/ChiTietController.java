package vietpt.controller;


import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vietpt.entity.NhanVien;

@Controller
@RequestMapping("/chitiet")
public class ChiTietController {
    @GetMapping
    public String daufault(){
        return "chitiet";
    }
    @PostMapping
    public String Capnhapsv(@ModelAttribute NhanVien nv, ModelMap modelMap){
        modelMap.addAttribute("nv",nv);
        return "chitiet";

    }
}
