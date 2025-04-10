package ontap.De_Nhat;

public class SinhVien_Nhat {
    String maSV;
    String hoTenSV;
    String ngaySinh;
    String queQuan;

    public SinhVien_Nhat(String maSV, String hoTenSV, String ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return  "Mã số: " + maSV + "\n" +
                "Sinh viên: " + hoTenSV + "\n" +
                "Ngày sinh: " + ngaySinh + "\n" +
                "Quê Quán: " + queQuan + "\n";
    }
}
