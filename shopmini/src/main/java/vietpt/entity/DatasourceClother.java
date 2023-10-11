package vietpt.entity;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import javax.sql.DataSource;
@Repository
public class DatasourceClother {
    private JdbcTemplate jdbcTemplate;
    public void  setDatasource(DataSource dataSource){
       this.jdbcTemplate=new JdbcTemplate(dataSource);


    }
    public List<Lop> getlop() {
        String sql = "select *from lop";
        List<Lop> list = jdbcTemplate.query(sql, new RowMapper<Lop>() {
            @Override
            public Lop mapRow(ResultSet rs, int rowNum) throws SQLException {
                Lop lop= new Lop();
                lop.malop= rs.getInt("malop");
                lop.tenlop=rs.getString("tenlop");
                return lop;
            }

        });
        for (Lop l :list)
        {
            System.out.println("ma lop :"+l.malop+"Ten lop:"+l.tenlop);
        }
        return list;

    }
}