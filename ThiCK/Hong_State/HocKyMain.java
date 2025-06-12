package ThiCK.OnTap.Hong_State;

public class HocKyMain {
    public static void main(String[] args) {
        HocKy hk = new HocKy();
        MonHoc m1 = new MonHoc("Toan", 3, 7);
        MonHoc m2 = new MonHoc("An toàn bảo mật", 3, 8);

        hk.addMonHoc(m1);
        hk.addMonHoc(m2);
        hk.getTrangThai();
        hk.display();
    }
}
