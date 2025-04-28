package bt_java.baitap_cb3;

public class BacThongThuong extends TienDienBacThang{
    TienDienBacThang bacKeTiep;
    public BacThongThuong(String tenBac, int min, int max, int gia) {
        super(tenBac, min, max, gia);
    }

    @Override
    public TienDienBacThang bacKeTiep(TienDienBacThang b) {
        this.bacKeTiep = b;
        return b;
    }

    @Override
    public int tinhTienDien(int soKW) {
        if(soKW <= max)
            return ((soKW - min) * gia);
        else
            return (max - min) * gia + bacKeTiep.tinhTienDien(soKW);
    }
}
