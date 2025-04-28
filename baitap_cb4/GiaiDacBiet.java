package bt_java.baitap_cb4;

public class GiaiDacBiet extends  GiaiThuongVeSo{

    public GiaiDacBiet(String maSo) {
        super(maSo);
        this.tenGiai = "Giải Đặc Biệt";
    }

    @Override
    public GiaiThuongVeSo giaiThuong(String maSo) {
        if(maSo.endsWith(this.maSo))
            return this;
        else
            return null;
    }

    @Override
    public GiaiThuongVeSo giaiThuongKeTiep(GiaiThuongVeSo gtkt) {
        return null;
    }
}
