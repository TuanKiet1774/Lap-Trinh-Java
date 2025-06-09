package ThiCK.OnTap.Nhat_State;

public class MatHang {
    public String ten;
    public int soLuong;
    public double donGia;

    public MatHang(String ten, int soLuong, double donGia) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public double thanhTien(){
        return soLuong * donGia;
    }
}
