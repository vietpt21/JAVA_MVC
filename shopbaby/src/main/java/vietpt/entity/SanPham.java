package vietpt.entity;

import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import java.util.Set;

@Entity(name = "SanPham")
public class SanPham {
    @Id
    int masanpham;
    String tensanpham;
    String giatien;

    public Set<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(Set<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "NhanVienSanPham",
            joinColumns = { @JoinColumn(name = "masanpham",referencedColumnName = "masanpham") },
            inverseJoinColumns = {@JoinColumn(name = "manhanvien",referencedColumnName = "manhanvien") })
    Set<NhanVien> nhanViens;


    public SanPham(int masanpham, String tensanpham, String giatien){
        this.masanpham=masanpham;
        this.tensanpham=tensanpham;
        this.giatien=giatien;
    }

    public SanPham() {

    }
    public int getMasanpham() {
        return masanpham;
    }
    public void setMasanpham(int masanpham) {this.masanpham = masanpham;}
    public String getTensanpham() {
        return tensanpham;
    }
    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }
    public String getGiatien() {
        return giatien;
    }
    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }
}
