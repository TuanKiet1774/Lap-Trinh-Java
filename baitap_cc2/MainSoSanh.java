package bt_java.baitap_cc2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MainSoSanh {
    public static void main(String[] args) {
        List<SinhVien> dsSV = new ArrayList<>();
        dsSV.add(new SinhVien("Huỳnh Minh Bảo", "30/06/2004", 8));
        dsSV.add(new SinhVien("Nguyễn Hiểu Quyên","17/10/2004", 9));
        dsSV.add(new SinhVien("Lê Văn Lương", "01/01/2004", 7));
        dsSV.add(new SinhVien("Vĩnh Thuận", "31/08/2004", 9));
        dsSV.add(new SinhVien("Phạm Tuấn Kiệt", "17/07/2004", 5));

        ISoSanh<SinhVien> ss1 = new SoSanhTheoDiem();
        ISoSanh<SinhVien> ss2 = new SoSanhTheoTen();
        QLSV ql1 = new QLSV(ss1, dsSV);
        ql1.sapXep();
        System.out.println("So sánh theo điểm:");
        ql1.inDS();
        QLSV ql2 = new QLSV(ss2, dsSV);
        ql2.sapXep();
        System.out.println("\nSo sánh theo tên:");
        ql2.inDS();
    }
}
