package ontap.De_DuyAn;

public class Main {
    public static void main(String[] args) {
        UI_AN u1 = new UI_AN();

        SanPham_AN sp1 = new SanPham_AN("MG", "Mì 3 miền",20, 3000);
        SanPham_AN sp2 = new SanPham_AN("TG", "Trứng gà",5, 2000);

        u1.them(sp1);
        u1.them(sp2);
        u1.hienThi_AN();

        System.out.println("\nSau khi trứng gà");
        u1.xoa(sp2);
        u1.hienThi_AN();
    }
}