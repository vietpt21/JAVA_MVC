package vietpt.entity;

public class GiamDoc extends NhanVien {
    public String getChucvu() {
        return chucvu;
    }

    String chucvu;

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    public GiamDoc(String ten,int tuoi, String chucvu){
      super(ten,tuoi);
        this.chucvu=chucvu;
    }



}
