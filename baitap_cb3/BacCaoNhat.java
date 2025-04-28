package bt_java.baitap_cb3;

public class BacCaoNhat extends TienDienBacThang{
    public BacCaoNhat(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang bacKeTiep(TienDienBacThang b) {
        return null;
    }

    @Override
    public int tinhTienDien(int soKW) {
        return (soKW - min) * gia;
    }
}
