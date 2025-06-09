package bt_java.baitap_cb4;

import java.util.List;

public class GiaiThapNhat extends GiaiThuongVeSo{
    public GiaiThapNhat(List<String> dsMaSo, String tenGiai) {
        super(dsMaSo, tenGiai);
    }

    @Override
    public String doVeSo(String ms) {
        for(var i: dsMaSo)
            if(ms.endsWith(i))
                return "Chúc mừng bạn đã trúng giải: " + tenGiai;
        return "Chúc bạn may mắn lần sau";
    }

    @Override
    public GiaiThuongVeSo giaiKeTiep(GiaiThuongVeSo gkt) {
        return null;
    }
}
