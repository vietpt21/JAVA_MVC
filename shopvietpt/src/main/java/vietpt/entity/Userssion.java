package vietpt.entity;

import javax.persistence.*;

@Entity(name = "userssion")
public class Userssion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
int userid;
String tendangnhap;
String matkhau;
    public int getUserid() {return userid;}
    public void setUserid(int userid) {this.userid = userid;}
    public String getTendangnhap() {return tendangnhap;}
    public void setTendangnhap(String tendangnhap) {this.tendangnhap = tendangnhap;}
    public String getMatkhau() {return matkhau;}

    public void setMatkhau(String matkhau) {this.matkhau = matkhau;}
}
