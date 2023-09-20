package vietpt.entity;

import java.util.List;

public class NhanVien {
    String ten;
    String diachi;
    int tuoi;
    GiamDoc doc;
    List<String> list;
    List<GiamDoc> giamDocs;

    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }


    public String getTen() {return ten;}
    public String getDiachi() {return diachi;}
    public int getTuoi() {return tuoi;}
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public NhanVien(String ten,int tuoi,String diachi)
    {
        this.ten=ten;
        this.tuoi=tuoi;
        this.diachi=diachi;
    }
    public NhanVien(String ten,int tuoi)
    {
        this.ten=ten;
        this.tuoi=tuoi;

    }
    public NhanVien(GiamDoc doc){
        this.doc=doc;

    }
    public GiamDoc getDoc() {
        return doc;
    }
    public void setDoc(GiamDoc doc) {
        this.doc = doc;
    }


    public  NhanVien(){};
    public void start(){
        System.out.println("Bắt đầu");
    }
    public void deloy(){
        System.out.println("Kết thúc");
    }
    public  NhanVien CreateNhanVien(){
      NhanVien nv = new NhanVien();
      nv.setTen("Viet");
      return nv;
    }
    public void getThongBao(){
        System.out.println("xin chào "+ ten+tuoi);
    }

}
