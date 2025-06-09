package bt_java.baitap_cb4;

import java.util.Arrays;

public class MainVeSo {
    public static void main(String[] args){
        GiaiThuongVeSo GDB = new GiaiThuongKhac(Arrays.asList("104211"),"Giải Đặc Biệt");
        GiaiThuongVeSo G1 = new GiaiThuongKhac(Arrays.asList("10560"),"Giải Nhất");
        GiaiThuongVeSo G2 = new GiaiThuongKhac(Arrays.asList("08566"),"Giải Nhì");
        GiaiThuongVeSo G3 = new GiaiThuongKhac(Arrays.asList("59938","74698"),"Giải Ba");
        GiaiThuongVeSo G4 = new GiaiThuongKhac(Arrays.asList("74089","28953","89181","91204","42978","02564","47704"),"Giải Tư");
        GiaiThuongVeSo G5 = new GiaiThuongKhac(Arrays.asList("1203"),"Giải Năm");
        GiaiThuongVeSo G6 = new GiaiThuongKhac(Arrays.asList("9335","7332","0013"),"Giải Sáu");
        GiaiThuongVeSo G7 = new GiaiThuongKhac(Arrays.asList("097"),"Giải Bảy");
        GiaiThuongVeSo G8 = new GiaiThapNhat(Arrays.asList("18"),"Giải Tám");

        GDB.giaiKeTiep(G1).
        giaiKeTiep(G2).
        giaiKeTiep(G3).
        giaiKeTiep(G4).
        giaiKeTiep(G5).
        giaiKeTiep(G6).
        giaiKeTiep(G7).
        giaiKeTiep(G8);

        String ms = "104018";
        String kq = GDB.doVeSo(ms);
        System.out.println("KẾT QUẢ XỔ SỐ KHÁNH HÒA 27 - 04 -2025");
        System.out.println(kq);
    }
}
