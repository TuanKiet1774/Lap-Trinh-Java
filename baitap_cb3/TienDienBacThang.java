package bt_java.baitap_cb3;

public abstract class TienDienBacThang {
    public String tenBac;
    int min, max, gia;

    public TienDienBacThang(String tenBac, int min, int max, int gia) {
        this.tenBac = tenBac;
        this.min = min;
        this.max = max;
        this.gia = gia;
    }

    public abstract TienDienBacThang bacKeTiep(TienDienBacThang b);

    public abstract int tinhTienDien(int soKW);
}
