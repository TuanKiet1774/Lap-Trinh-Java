package bt_java.baitap_cb4;

public abstract class GiaiThuongVeSo {
    protected String maSo;
    protected String tenGiai;

    public GiaiThuongVeSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTenGiai() {
        return tenGiai;
    }

    public abstract GiaiThuongVeSo giaiThuong(String maSo);

    public abstract GiaiThuongVeSo giaiThuongKeTiep(GiaiThuongVeSo gtkt);
}
