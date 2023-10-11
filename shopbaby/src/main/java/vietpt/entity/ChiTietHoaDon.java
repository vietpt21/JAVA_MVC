package vietpt.entity;


import javax.persistence.JoinColumn;

public class ChiTietHoaDon {
    String mahoadon;
    String masanpham;
    String masize;
    String mamausanpham;
    public String getMahoadon() {return mahoadon;}
    public void setMahoadon(String mahoadon) {this.mahoadon = mahoadon;}

    public String getMasanpham() {return masanpham;}
    public void setMasanpham(String masanpham) {this.masanpham = masanpham;}
    public String getMasize() {return masize;}
    public void setMasize(String masize) {this.masize = masize;}
    public String getMamausanpham() {return mamausanpham;}
    public void setMamausanpham(String mamausanpham) {this.mamausanpham = mamausanpham;}
}
