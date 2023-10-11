package vietpt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "sinhvien")
public class SinhVien {
    public int getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(int masinhvien) {this.masinhvien = masinhvien;}

    public String getTensinhvien() {return tensinhvien;}

    public void setTensinhvien(String tensinhvien) {this.tensinhvien = tensinhvien;}

    public int getGioitinh() {return gioitinh;}

    public void setGioitinh(int gioitinh) {this.gioitinh = gioitinh;}

    public String getQuequan() {return quequan;}

    public void setQuequan(String quequan) {this.quequan = quequan;}

    public int getSodienthoai() {return sodienthoai;}

    public void setSodienthoai(int sodienthoai) {this.sodienthoai = sodienthoai;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    @Id
    int masinhvien;
    String tensinhvien;
    int gioitinh;
    String quequan;
    int sodienthoai;
    String email;
}
