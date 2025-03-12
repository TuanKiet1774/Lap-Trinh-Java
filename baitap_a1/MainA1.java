package bt_java.baitap_a1;

public class MainA1 {
    public static void main(String[] args) {
        chitiethoadon ct = new chitiethoadon("Mì gói", 200, 2, 10);
        hoadon h = new hoadon.Builder().builheader("hd123","12/12/2024","Phạm Tuấn Kiệt").addCthd(ct).build();

        System.out.println(h);
    }
}
