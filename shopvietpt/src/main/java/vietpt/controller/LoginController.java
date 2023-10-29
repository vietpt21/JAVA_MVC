package vietpt.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vietpt.entity.ChucVu;
import vietpt.entity.NhanVien;
import vietpt.service.ChucVuservice;
import vietpt.service.NhanVienservice;

import java.util.List;

@Controller

@RequestMapping("/")
public class LoginController {
    @Autowired
    NhanVienservice nhanVienservice;
    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    ChucVuservice chucVuservice;
    private  List<ChucVu> lstcv = null;

    @GetMapping("/account")
    @Transactional
    public String index(ModelMap modelMap)  {
        lstcv = chucVuservice.lstChucVu();
        modelMap.addAttribute("cv" , lstcv);
        return "login";
    }

    @PostMapping("/dangky")
    @Transactional
    public  String createCustomer(@RequestParam String machucvu,@RequestParam String tendangnhap,@RequestParam String matkhau,@RequestParam String nhaplaimatkhau,ModelMap modelMap){
     try {
         ChucVu cvItem =null;
         lstcv = chucVuservice.lstChucVu();
         for (ChucVu cv : lstcv) {
             if(cv.getMachucvu().equals(machucvu))
                cvItem =cv;
         }
         if(matkhau.equals(nhaplaimatkhau)){
             NhanVien nhanVien= new NhanVien();
             nhanVien.setTennhanvien("");
             nhanVien.setDiachi("");
             nhanVien.setGioitinh(0);
             nhanVien.setCmnn("");
             nhanVien.setChucVu(cvItem);
             nhanVien.setEmail("");
             nhanVien.setTendangnhap(tendangnhap);
             nhanVien.setMatkhau(matkhau);
             boolean kt = nhanVienservice.Themnhanvien(nhanVien);
             if(kt ==true){
                 modelMap.addAttribute("ketqua","Thanh cong");
             }
             else {
                 modelMap.addAttribute("ketqua","that bại");
             }
         }
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
        return  "login";
    }
}
