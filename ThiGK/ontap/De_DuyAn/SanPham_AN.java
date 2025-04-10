package ontap.De_DuyAn;

public class SanPham_AN {
    String maSP;
    String tenSP;
    int soLuong;
    float donGia;

    public SanPham_AN(String maSP, String tenSP, int soLuong, float donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return tenSP + " (" + maSP + ") - Số lượng: " + soLuong + " - Đơn giá: " + donGia;
    }
}
