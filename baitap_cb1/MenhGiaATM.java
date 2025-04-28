package bt_java.baitap_cb1;

public abstract class MenhGiaATM {
    protected int giaTri;

    public MenhGiaATM(int giaTri) {
        this.giaTri = giaTri;
    }

    public abstract MenhGiaATM thietLapKeTiep(MenhGiaATM keTiep);

    public abstract void rutTien(int soTien);
}
