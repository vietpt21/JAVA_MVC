package vietpt.entity;

import javax.persistence.*;
import java.lang.ref.Reference;
import java.util.Set;

@Entity(name = "NhanVien")
public class NhanVien {

    @Id
    int manhanvien;
    String tennhanvien;
    String diachi;
    int gioitinh;
    String cmnn;
    String sodienthoai;
    String machucvu;
    String email;

    public Set<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(Set<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "NhanVienSanPham",
            joinColumns = { @JoinColumn(name = "manhanvien",referencedColumnName = "manhanvien")},
            inverseJoinColumns = {@JoinColumn(name = "masanpham" ,referencedColumnName = "masanpham") })
    Set<SanPham> sanPhams;

    public String getMachucvu() {return machucvu;}
    public void setMachucvu(String machucvu) {this.machucvu = machucvu;}
    public int getManhanvien() {return manhanvien;}
    public void setManhanvien(int manhanvien) {this.manhanvien = manhanvien;}
    public String getTennhanvien() {return tennhanvien;}
    public void setTennhanvien(String tennhanvien) {this.tennhanvien = tennhanvien;}
    public String getDiachi() {return diachi;}

    public void setDiachi(String diachi) {this.diachi = diachi;}
    public int getGioitinh() {return gioitinh;}
    public void setGioitinh(int gioitinh) {this.gioitinh = gioitinh;}
    public String getCmnn() {return cmnn;}
    public void setCmnn(String cmnn) {this.cmnn = cmnn;}
    public String getSodienthoai() {return sodienthoai;}
    public void setSodienthoai(String sodienthoai) {this.sodienthoai = sodienthoai;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
}
