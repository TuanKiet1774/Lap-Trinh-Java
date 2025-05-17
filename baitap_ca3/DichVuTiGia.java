package bt_java.baitap_ca3;

import java.util.ArrayList;
import java.util.List;

public class DichVuTiGia {
    List<ThayDoiTiGia> nhaDauTu = new ArrayList<>();
    void dangKy(ThayDoiTiGia ndt){
        nhaDauTu.add(ndt);
    }

    void huyDangKy(ThayDoiTiGia ndt){
        nhaDauTu.remove(ndt);
    }

    void thongBao (float delta){
        for(var ndt:nhaDauTu)
            ndt.nhanThongBao(delta);
    }
}
