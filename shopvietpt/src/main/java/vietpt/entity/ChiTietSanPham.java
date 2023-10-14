package vietpt.entity;

import javax.persistence.*;

@Entity(name = "ChiTietSanPham")
public class ChiTietSanPham {
    @Id
    String machitietsanpham;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "masanpham")
    SanPham sanPham;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "masize")
    Size size;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mamau")
    MauSanPham mauSanPham;
    int soluong;
    String ngaynhap;
    public String getMachitietsanpham() {return machitietsanpham;}
    public void setMachitietsanpham(String machitietsanpham) {this.machitietsanpham = machitietsanpham;}

    public SanPham getSanPham() {return sanPham;}
    public void setSanPham(SanPham sanPham) {this.sanPham = sanPham;}

    public Size getSize() {return size;}
    public void setSize(Size size) {this.size = size;}
    public MauSanPham getMauSanPham() {return mauSanPham;}
    public void setMauSanPham(MauSanPham mauSanPham) {this.mauSanPham = mauSanPham;}
    public int getSoluong() {return soluong;}
    public void setSoluong(int soluong) {this.soluong = soluong;}
    public String getNgaynhap() {return ngaynhap;}
    public void setNgaynhap(String ngaynhap) {this.ngaynhap = ngaynhap;}

}
