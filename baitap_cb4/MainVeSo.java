package bt_java.baitap_cb4;

public class MainVeSo {
    public static void main(String[] args) {
        GiaiThuongVeSo G3 = new GiaiThuongKhac("59938","Giải 3");
        GiaiThuongVeSo G2 = new GiaiThuongKhac("08566", "Giải 2");
        GiaiThuongVeSo G1 = new GiaiThuongKhac("10560", "Giải nhất");
        GiaiThuongVeSo GDB = new GiaiDacBiet("104211");

        G3.giaiThuongKeTiep(G2).giaiThuongKeTiep(G1).giaiThuongKeTiep(GDB);
        String ms = "759938";
        GiaiThuongVeSo kq = G3.giaiThuong(ms);

        System.out.println("KẾT QUẢ XỔ SỐ KHÁNH HÒA NGÀY 27 - 04 - 2025");
        if (kq != null)
            System.out.println("Chúc mừng! Vé số " + ms + " đã trúng " + kq.getTenGiai());
        else
            System.out.println("Rất tiếc! Vé số " + ms + " không trúng giải nào.");
    }
}
