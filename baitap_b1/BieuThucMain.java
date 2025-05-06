package bt_java.baitap_b1;

public class BieuThucMain {
    public static void main(String[] args) {
        BieuThuc a = new BieuThucDonGian(5);
        a = new Cong(a,3);
        a = new Nhan(a, 2);
        System.out.println(a.toString());
    }
}
