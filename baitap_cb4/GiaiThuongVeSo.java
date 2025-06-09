package bt_java.baitap_cb4;
import java.util.List;

public abstract class GiaiThuongVeSo {
    protected List<String> dsMaSo;
    protected String tenGiai;

    public GiaiThuongVeSo(List<String> dsMaSo, String tenGiai) {
        this.dsMaSo = dsMaSo;
        this.tenGiai = tenGiai;
    }

    public  abstract String doVeSo(String ms);
    public abstract GiaiThuongVeSo giaiKeTiep(GiaiThuongVeSo gkt);
}
