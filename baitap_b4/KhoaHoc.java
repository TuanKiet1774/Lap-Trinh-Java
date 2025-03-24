package bt_java.baitap_b4;

public abstract class KhoaHoc {
    protected String ten;

    public KhoaHoc(String ten) {
        this.ten = ten;
    }

    public abstract int TongTinChi();
    public abstract double TongHocPhi();
    public abstract void InDS();
}
