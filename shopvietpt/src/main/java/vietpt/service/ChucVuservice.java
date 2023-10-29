package vietpt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vietpt.dao.ChucVudao;
import vietpt.entity.ChucVu;
import vietpt.implement.ChucVuImp;

import java.util.List;

@Service
public class ChucVuservice implements ChucVuImp {
    @Autowired
    ChucVudao chucVudao;

    @Override
    public List<ChucVu> lstChucVu() {
        return chucVudao.lstChucVu();
    }
}
