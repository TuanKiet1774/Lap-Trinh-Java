package bt_java.baitap_ca5;

public class MainCA5 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan TK = new TaiKhoan("Tuấn Kiệt", 20000000, atm);
        System.out.println("- Lần 1:");
        TK.duaTheVao();
        atm.rutTien(5000000);
        TK.rutTheATM();

        System.out.println("- Lần 2:");
        atm.rutTien(100000);

        System.out.println("- Lần 3:");
        TK.duaTheVao();
        atm.rutTien(20000000);

    }
}
