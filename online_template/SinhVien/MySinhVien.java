package behavioral.template.SinhVien;

public class MySinhVien {
    private int maSV;
    private String tenSV, ngaySinh, queQuan;

    public MySinhVien(int maSV, String tenSV, String ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Họ tên sinh viên: " + tenSV + "\n" +
                " + Mã sinh viên: " + maSV + "\n" +
                " + Ngày sinh: " + ngaySinh + "\n" +
                " + Quê quán: " + queQuan ;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
