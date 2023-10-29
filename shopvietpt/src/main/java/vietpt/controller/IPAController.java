package vietpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import vietpt.service.NhanVienservice;

@Controller
@RequestMapping("api/")
@SessionAttributes("user")

public class IPAController {
    @Autowired
    NhanVienservice nhanVienservice;

}
