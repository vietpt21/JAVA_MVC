package vietpt.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChiTietSanPhamHD  implements Serializable {
    String mahoadon;
    String machitietsanpham;

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getMachitietsanpham() {
        return machitietsanpham;
    }

    public void setMachitietsanpham(String machitietsanpham) {
        this.machitietsanpham = machitietsanpham;
    }
}
