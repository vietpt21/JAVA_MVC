package vietpt.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vietpt.entity.ChucVu;
import vietpt.implement.ChucVuImp;

import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ChucVudao implements ChucVuImp {
    @Autowired
    SessionFactory sessionFactory;


    @Transactional
    @Override
    public List<ChucVu> lstChucVu() {
        Session  session = sessionFactory.getCurrentSession();
        String hql = "from ChucVu";
        Query query = session.createQuery(hql);
        List<ChucVu> lstChucVu = query.list();
        return  lstChucVu;
    }
}