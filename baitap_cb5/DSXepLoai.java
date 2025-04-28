package bt_java.baitap_cb5;

public abstract class DSXepLoai {
    protected int diemMin, diemMax;
    protected String xepLoai;

    public DSXepLoai(int diemMin, int diemMax) {
        this.diemMin = diemMin;
        this.diemMax = diemMax;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public abstract String XepLoaiHS(int diem);

    public abstract DSXepLoai loaiKeTiep(DSXepLoai lkt);
}
