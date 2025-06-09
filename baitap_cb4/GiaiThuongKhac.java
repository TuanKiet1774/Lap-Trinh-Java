package bt_java.baitap_cb4;

import java.util.List;

public class GiaiThuongKhac extends GiaiThuongVeSo{
    protected GiaiThuongVeSo gtkt;
    public GiaiThuongKhac(List<String> dsMaSo, String tenGiai) {
        super(dsMaSo, tenGiai);
    }

    @Override
    public String doVeSo(String ms) {
        for(var i: dsMaSo)
            if(ms.endsWith(i))
                return "Chúc mừng bạn đã trúng giải: " + tenGiai;
        return this.gtkt.doVeSo(ms);
    }

    @Override
    public GiaiThuongVeSo giaiKeTiep(GiaiThuongVeSo gkt) {
        this.gtkt = gkt;
        return this.gtkt;
    }
}
