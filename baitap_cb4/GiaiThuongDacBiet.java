package bt_java.baitap_cb4;

import java.util.List;

public class GiaiThuongDacBiet extends GiaiThuongVeSo{
    public GiaiThuongDacBiet(List<String> dsMaSo, String tenGiai) {
        super(dsMaSo, tenGiai);
    }

    @Override
    public String doVeSo(String ms) {
        for(var i: dsMaSo)
            if(ms.endsWith(i))
                return getTenGiai();
        return null;
    }

    @Override
    public GiaiThuongVeSo giaiKeTiep(GiaiThuongVeSo gkt) {
        return null;
    }
}
