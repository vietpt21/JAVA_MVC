package vietpt.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vietpt.entity.NhanVien;
import vietpt.implement.NhanVienimp;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NhanViendao  implements NhanVienimp {
    @Autowired
    SessionFactory sessionFactory;
    @Transactional
    @Override
    public boolean Themnhanvien(NhanVien nhanVien) {
        Session session = sessionFactory.getCurrentSession();
        boolean status = false;
        String sql  =  "INSERT INTO  nhanvien( tennhanvien, diachi, gioitinh, cmnn, machucvu, email, tendangnhap, matkhau) values (";
        sql += "'"+nhanVien.getTennhanvien()+"',";
        sql += "'"+nhanVien.getDiachi()+"',";
        sql += "'"+nhanVien.getGioitinh()+"',";
        sql += "'"+nhanVien.getCmnn()+"',";
        sql += "'"+nhanVien.getChucVu().getMachucvu()+"',";
        sql += "'"+nhanVien.getEmail()+"',";
        sql += "'"+nhanVien.getTendangnhap()+"',";
        sql += "'"+nhanVien.getMatkhau()+"')";
        try {
            Query query = session.createSQLQuery(sql);
            query.executeUpdate();
            status =true;
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return  status;
    }
}