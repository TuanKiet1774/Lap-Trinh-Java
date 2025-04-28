package bt_java.baitap_cb5;

public class MainXepLoai {
    public static void main(String[] args) {
        DSXepLoai xuatSac = new XepLoaiXuatSac(9,10, "Xuất sắc");
        DSXepLoai gioi = new XepLoaiKhac(8,9, "Giỏi");
        DSXepLoai kha = new XepLoaiKhac(7,8, "Khá");
        DSXepLoai trungBinh = new XepLoaiKhac(5,7, "Trung bình");
        DSXepLoai yeu = new XepLoaiKhac(0,5, "Yếu");

        yeu.loaiKeTiep(trungBinh).loaiKeTiep(kha).loaiKeTiep(gioi).loaiKeTiep(xuatSac);
        int diem = 10;
        System.out.println("Điểm: " + diem + " ==> Xếp loai: " + yeu.XepLoaiHS(diem));
    }
}
