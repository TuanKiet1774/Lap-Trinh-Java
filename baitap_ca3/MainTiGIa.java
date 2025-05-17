package bt_java.baitap_ca3;

public class MainTiGIa {
    public static void main(String[] args) {
        DichVuTiGia dvtg = new DichVuTiGia();
        NhaDauTu kiet = new NhaDauTuA("Phạm Tuấn Kiệt",dvtg);
        NhaDauTu bao = new NhaDauTuB("Huỳnh Minh Bảo",dvtg);

        kiet.dangKy();
        bao.dangKy();
        dvtg.thongBao(5);
        bao.huyDangKy();
        dvtg.thongBao(-5);
    }
}
//Nhận thông báo là observer
