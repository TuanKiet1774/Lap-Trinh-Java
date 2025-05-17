package bt_java.baitap_ca3;

public abstract class NhaDauTu implements ThayDoiTiGia{
    String ten;
    DichVuTiGia dvtg;

    public NhaDauTu(String ten, DichVuTiGia dvtg) {
        this.ten = ten;
        this.dvtg = dvtg;
        //dvtg.dangKy(this); //Khi khởi tạo sẽ đăng ký luôn
    }

    public void dangKy(){
        dvtg.dangKy(this);
    }
    public void huyDangKy(){
        dvtg.huyDangKy(this);
    }
}
