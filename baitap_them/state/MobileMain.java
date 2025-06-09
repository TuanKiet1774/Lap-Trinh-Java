package bt_java.baitap_them.state;

public class MobileMain {
    public static void main(String[] args) {
        MobileService tb = new MobileService(new NormalState(), 0, "Tuấn Kiệt");
        System.out.println("Nạp 120k");
        tb.napTien(120_000);
        tb.inThongTin();
        System.out.println("Nạp 30k");
        tb.napTien(30_000);
        tb.inThongTin();
        System.out.println("Gọi 50p");
        tb.goiDien(50*60);
        tb.inThongTin();
    }
}
