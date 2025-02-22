package bt_java.baitap_a6;

public class MainA6 {
    public static void main(String[] args) {
        UI ui1 = new UI();
        UI ui3 = new UI();
        UI ui2 = new UI();

        SanPham sp1 = new SanPham("1", "Mì gói", 2500, 50000);
        SanPham sp_u1 = new SanPham("1", "Mì gói 3 miền", 2500, 50000);
        SanPham sp2 = new SanPham("2", "Trứng", 1000, 5);
        SanPham sp3 = new SanPham("3", "Gà", 1000, 5);

        System.out.println("Sản phẩm của UI1");
        ui1.Add_P(sp1);
        ui1.Add_P(sp2);
        ui1.Add_P(sp3);
        ui1.Display();

        System.out.println("Sản phẩm của UI1 sau khi cập nhật: ");
        ui1.Update_P(sp_u1);
        ui1.Display();
    }
}
