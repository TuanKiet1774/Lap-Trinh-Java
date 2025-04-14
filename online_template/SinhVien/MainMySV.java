package behavioral.template.SinhVien;

public class MainMySV {
    public static void main(String[] args) {
        MySinhVienDB dssv = new MySinhVienDB();
        MySinhVien sv1 = new MySinhVien(64131060,"Phạm Tuấn Kiệt","17/07/2004","Diên Khánh");
        MySinhVien sv2 = new MySinhVien(64131600,"Huỳnh Minh Bảo","30/06/2004","Phú Yên");
        dssv.add(sv1);
        dssv.add(sv2);

        System.out.println("DÁNH SÁCH SINH VIÊN");
        dssv.hienThiDS();
    }
}
