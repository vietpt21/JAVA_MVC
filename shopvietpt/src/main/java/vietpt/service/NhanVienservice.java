package vietpt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vietpt.dao.NhanViendao;
import vietpt.entity.NhanVien;
import vietpt.implement.NhanVienimp;

@Service
public class NhanVienservice implements NhanVienimp {
    @Autowired
    NhanViendao nhanViendao;
    @Override
    public boolean Themnhanvien(NhanVien nhanVien) {
      try{
          nhanViendao.Themnhanvien(nhanVien);
          return  true;
      }catch (Exception exception){
          return false;
      }
    }
}
