package ontap.De_Nhat;

public class Main_Nhat {
    public static void main(String[] args) {
        SinhVien_Nhat sv = new SinhVien_Nhat("64131060", "Phạm Tuấn Kiêt", "17/07/2004","Diên Khánh");
        MonHoc_Nhat mh1 = new MonHoc_Nhat("LTTBDD","Lập trình thiết bị di động",3);
        MonHoc_Nhat mh2 = new MonHoc_Nhat("KTTKPM","Kiến trúc thiết kế phần mềm",3);
        MonHoc_Nhat mh3 = new MonHoc_Nhat("TRR","Toán rời rạc",3);

        KeHoachHocTap_Nhat kh = new KeHoachHocTap_Nhat.Builder()
                .getSinhVien(sv)
                .addDK(mh1)
                .addCT(mh2)
                .addCT(mh3)
                .build();
        //kh.hienThi();

        HeThongLuuTru_Nhat ht = HeThongLuuTru_Nhat.getInstance();
        ht.addKH("64131060",kh);
        System.out.println("=====HỆ THỐNG LƯU TRỮ KẾ HOẠCH HỌC TẬP=====");
        ht.hienThiKH();

        System.out.println("\nSau khi xóa toán rời rạc");
        kh.removeCT(mh3);
        ht.hienThiKH();
    }
}
