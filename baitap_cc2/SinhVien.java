package bt_java.baitap_cc2;

import javax.xml.crypto.Data;
import java.util.Date;

public class SinhVien {
    private String hoTen;
    private String ngaySinh;
    private float diemTB;

    public SinhVien(String hoTen, String ngaySinnh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinnh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinnh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }
}
