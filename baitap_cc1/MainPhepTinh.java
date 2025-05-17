package bt_java.baitap_cc1;

public class MainPhepTinh {
    public static void main(String[] args) {
        Tinh cong = new cong();
        context c = new context();
        c.setTinhToan(cong);
        System.out.println(c.tinh(75,12));

        Tinh tru = new tru();
        c.setTinhToan(tru);
        System.out.println(c.tinh(54,78));
    }
}
