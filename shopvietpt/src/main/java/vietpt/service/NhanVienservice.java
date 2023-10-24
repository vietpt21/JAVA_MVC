package vietpt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vietpt.dao.NhanViendao;
import vietpt.implement.NhanVienimp;

@Service
public class NhanVienservice implements NhanVienimp {

    @Autowired
    NhanViendao nhanViendao;
    @Override
    public boolean Kiemtradangnhap(String tendangnhap, String matkhau) {
        boolean kiemtra = nhanViendao.Kiemtradangnhap(tendangnhap, matkhau);
        return kiemtra;
    }
}
