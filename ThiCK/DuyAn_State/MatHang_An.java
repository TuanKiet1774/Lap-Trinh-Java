package ThiCK.OnTap.DuyAn_State;

public class MatHang_An {
    private String tenMH;
    private int soLuong, donGia;

    public MatHang_An(String tenMH, int soLuong, int donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }


    public int getDonGia() {
        return donGia;
    }

}
