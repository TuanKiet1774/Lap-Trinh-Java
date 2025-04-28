package bt_java.baitap_cb3;

public class MainTienDien {
    public static void main(String[] args) {
        TienDienBacThang m1 = new BacThongThuong("Bậc 1", 0, 50, 1806);
        TienDienBacThang m2 = new BacThongThuong("Bậc 2", 50, 100, 1866);
        TienDienBacThang m3 = new BacThongThuong("Bậc 3", 100, 200, 2167);
        TienDienBacThang m4 = new BacThongThuong("Bậc 4", 200, 300, 2729);
        TienDienBacThang m5 = new BacThongThuong("Bậc 5", 300, 400, 3050);
        TienDienBacThang m6 = new BacCaoNhat("Bậc 6", 400,Integer.MAX_VALUE , 3151);

        m1.bacKeTiep(m2).bacKeTiep(m3).bacKeTiep(m4).bacKeTiep(m5).bacKeTiep(m6);

        System.out.println("TỔNG TIỀN ĐIỆN: " + m1.tinhTienDien(450));

    }
}
