package bt_java.baitap_a1;

public class chitiethoadon {
    private String SanPham;
    private double DonGia;
    private int SoLuong;
    private int ChietKhau;

    public chitiethoadon(String sanPham, double donGia, int soLuong, int chietKhau) {
        SanPham = sanPham;
        DonGia = donGia;
        SoLuong = soLuong;
        ChietKhau = chietKhau;
    }

    public double getThanhTien(){
        return SoLuong * DonGia * (1 - (double)ChietKhau/100);
    }

    @Override
    public String toString() {
        return "chitiethoadon{" +
                "SanPham='" + SanPham + '\'' +
                ", DonGia=" + DonGia +
                ", SoLuong=" + SoLuong +
                ", ChietKhau=" + ChietKhau +
                ", Thanh tiền=" + getThanhTien()+
                '}';
    }
}
