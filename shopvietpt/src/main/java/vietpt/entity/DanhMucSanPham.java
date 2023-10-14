package vietpt.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "DanhMucSanPham")
public class DanhMucSanPham {
    @Id
    String madanhmuc;
    String tendanhmuc;
    String hinhdanhmuc;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "madanhmuc")
    Set<SanPham> sanPhams;
    public Set<SanPham> getSanPhams() {return sanPhams;}
    public void setSanPhams(Set<SanPham> sanPhams) {this.sanPhams = sanPhams;}
    public String getMadanhmuc() {return madanhmuc;}
    public void setMadanhmuc(String madanhmuc) {this.madanhmuc = madanhmuc;}
    public String getTendanhmuc() {return tendanhmuc;}
    public void setTendanhmuc(String tendanhmuc) {this.tendanhmuc = tendanhmuc;}
    public String getHinhdanhmuc() {return hinhdanhmuc;}
    public void setHinhdanhmuc(String hinhdanhmuc) {this.hinhdanhmuc = hinhdanhmuc;}
}
