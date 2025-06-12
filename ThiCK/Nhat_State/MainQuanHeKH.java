package ThiCK.OnTap.Nhat_State;
import java.util.Arrays;
import java.util.List;

public class MainQuanHeKH {
    public static void main(String[] args) {
        KhachHang kh1 = new KhachHang("KH001","Phạm Tuấn Kiệt");

        MatHang mh1 = new MatHang("Mì gói", 2, 3000);
        MatHang mh2 = new MatHang("Trứng gà", 5, 2000);
        MatHang mh3 = new MatHang("Thùng Number One", 5, 250000);
        List<MatHang> dsmh1 = Arrays.asList(mh1,mh2,mh3);

        var hd1 = kh1.muaHang(dsmh1);
        System.out.println(hd1);
        System.out.println("Đổi điểm: " + kh1.doiTienThuong() + " VNĐ");
    }
}
