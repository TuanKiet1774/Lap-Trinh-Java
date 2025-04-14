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

        System.out.println("\nTÌM THÔNG TIN SINH VIÊN");
        int id = 64131616;
        int id1 = 64131060;
        var temp = dssv.findMyID(id1);
        if(temp != null){
            System.out.println(temp);
        }
        else
            System.out.println("Không có thông tin của sinh viên có mã số " + id1);

        System.out.println("\nCẬP NHẬT THÔNG TIN SINH VIÊN");
        MySinhVien sv3 = new MySinhVien(64131600,"Diệp Ngọc Song","17/06/2004","Khánh Hòa");
        dssv.update(sv3);
        dssv.hienThiDS();
    }
}
