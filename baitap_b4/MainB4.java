package bt_java.baitap_b4;

public class MainB4 {
    public static void main(String[] args) {
        MonHoc mh1 = new MonHoc("Toan",2,20000);
        MonHoc mh2 = new MonHoc("ToanRR",3,25000);

        HocKy hk1 = new HocKy("HK1");

        hk1.addHocPhan(mh1);
        hk1.addHocPhan(mh2);

        hk1.InDS();
        System.out.println("Tổng số tín chỉ: " + hk1.TongTinChi());
        System.out.println("Tổng học phí: " + hk1.TongHocPhi());

    }
}
