package ThiCK.OnTap.DuyAn_State;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MatHang_An mh1 = new MatHang_An("Mì gói", 3, 5000);
        MatHang_An mh2 = new MatHang_An("Tủ lạnh",1,2500000);
        List<MatHang_An> mhs = new ArrayList<>(Arrays.asList(mh1, mh2));
        KhachHang_An kh = new KhachHang_An(mhs);
        kh.inHoaDon_An();
        System.out.println("-----------------------------");
        MatHang_An mh3 = new MatHang_An("Tivi",1,2500000);
        List<MatHang_An> mhs2 = new ArrayList<>(Arrays.asList(mh3));
        kh.setMhs_An(mhs2);
        kh.inHoaDon_An();
        System.out.println("------------------------------");
        MatHang_An mh5 = new MatHang_An("Tủ lạnh",3,2500000);
        List<MatHang_An> mhs3 = new ArrayList<>(Arrays.asList(mh1, mh5));
        kh.setMhs_An(mhs3);
        kh.inHoaDon_An();
    }
}