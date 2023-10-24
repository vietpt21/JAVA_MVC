package vietpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import vietpt.service.NhanVienservice;

@Controller
@RequestMapping("api/")
public class IPAController {
    @Autowired
    NhanVienservice nhanVienservice;
    @GetMapping("KiemTraDangNhap")
    @ResponseBody
    public String KiemTraDangNhap(@RequestParam String tendangnhap, @RequestParam String matkhau ){
       boolean kiemtra = nhanVienservice.Kiemtradangnhap(tendangnhap, matkhau);
       return ""+kiemtra;
    }
}
