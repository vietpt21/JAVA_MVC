package vietpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import vietpt.service.NhanVienservice;

@Controller
@RequestMapping("api/")
@SessionAttributes("tendangnhap")
public class IPAController {
    @Autowired
    NhanVienservice nhanVienservice;
    @GetMapping("KiemTraDangNhap")
    @ResponseBody
    public String KiemTraDangNhap(@RequestParam String tendangnhap, @RequestParam String matkhau, ModelMap modelMap ){
       boolean kiemtra = nhanVienservice.Kiemtradangnhap(tendangnhap, matkhau);
       modelMap.addAttribute("tendangnhap",tendangnhap);
       return ""+kiemtra;
    }
}
