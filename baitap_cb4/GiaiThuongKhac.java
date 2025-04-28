package bt_java.baitap_cb4;

public class GiaiThuongKhac extends GiaiThuongVeSo{
    GiaiThuongVeSo gtkt;

    public GiaiThuongKhac(String maSo, String tenGiai) {
        super(maSo);
        this.tenGiai = tenGiai;
    }

    @Override
    public GiaiThuongVeSo giaiThuong(String maSo) {
        if (maSo.endsWith(this.maSo)) {
            return this;
        }
        else if (gtkt != null) {
            return gtkt.giaiThuong(maSo);
        }
        return null;
    }

    @Override
    public GiaiThuongVeSo giaiThuongKeTiep(GiaiThuongVeSo gtkt) {
        this.gtkt = gtkt;
        return gtkt;
    }
}
