package bt_java.baitap_cb4;

import java.util.Arrays;

public class MainVeSo {
    public static void main(String[] args){
        GiaiThuongVeSo G1 = new GiaiThuongKhac(Arrays.asList("10560"),"Giải Nhất");
        GiaiThuongVeSo G2 = new GiaiThuongKhac(Arrays.asList("08566"),"Giải Nhì");
        GiaiThuongVeSo G3 = new GiaiThuongKhac(Arrays.asList("59938","74698"),"Giải Ba");
        GiaiThuongVeSo G4 = new GiaiThuongKhac(Arrays.asList("74089","28953","89181","91204","42978","02564","47704"),"Giải Tư");
        GiaiThuongVeSo G5 = new GiaiThuongKhac(Arrays.asList("1203"),"Giải Năm");
        GiaiThuongVeSo G6 = new GiaiThuongKhac(Arrays.asList("9335","7332","0013"),"Giải Sáu");
        GiaiThuongVeSo G7 = new GiaiThuongKhac(Arrays.asList("097"),"Giải Bảy");
        GiaiThuongVeSo G8 = new GiaiThuongKhac(Arrays.asList("18"),"Giải Tám");
        GiaiThuongVeSo GDB = new GiaiThuongDacBiet(Arrays.asList("104211"),"Giải Đặc Biệt");

        G1.giaiKeTiep(G2).
        giaiKeTiep(G3).
        giaiKeTiep(G4).
        giaiKeTiep(G5).
        giaiKeTiep(G6).
        giaiKeTiep(G7).
        giaiKeTiep(G8).
        giaiKeTiep(GDB);

        String ms = "124518";
        String kq = G1.doVeSo(ms);
        System.out.println("KẾT QUẢ XỔ SỐ KHÁNH HÒA 27 - 04 -2025");
        if(kq != null)
            System.out.println("Chúc mừng: Vé số (" + ms +") đã trung được " + kq);
        else
            System.out.println("Rất tiếc vé số của bạn không trúng thưởng");
    }
}
