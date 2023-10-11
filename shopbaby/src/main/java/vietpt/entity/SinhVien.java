package vietpt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name ="SinhVien")
public class SinhVien {
@Id
    String masinhvien;
    String tensinhvien;
    public SinhVien() {}
    public String getMasinhvien() {return masinhvien;}
    public void setMasinhvien(String masinhvien) {this.masinhvien = masinhvien;}
    public String getTensinhvien() {return tensinhvien;}
    public void setTensinhvien(String tesinhvien) {this.tensinhvien = tesinhvien;}

}
