package vietpt.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vietpt.entity.NhanVien;
import vietpt.implement.NhanVienimp;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NhanViendao implements NhanVienimp {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    @Transactional
    public boolean Kiemtradangnhap(String tendangnhap, String matkhau) {
        Session session = sessionFactory.getCurrentSession();
        try {
            String sql = "from NhanVien where tendangnhap='"+tendangnhap+"' and matkhau='"+matkhau+"'";
            NhanVien nhanVien = (NhanVien) session.createQuery(sql).getSingleResult();
            if(nhanVien != null){
                return true;
            }
            else
                return false;
        }
        catch (Exception e){
            return  false;
        }

    }
}
