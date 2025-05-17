package bt_java.baitap_b4;

import java.util.ArrayList;
import java.util.List;

public class HocKy extends KhoaHoc{
    List<KhoaHoc> dsmh = new ArrayList<>();

    public HocKy(String ten) {
        super(ten);
    }

    public void addHocPhan(KhoaHoc hp){
        dsmh.add(hp);
    }

    public void removeHocPhan(KhoaHoc hp){
        dsmh.remove(hp);
    }

    @Override
    public int TongTinChi() {
        int tc = 0;
        for(KhoaHoc i: dsmh){
            tc += i.TongTinChi();
        }
        return tc;
    }

    @Override
    public double TongHocPhi() {
        double hp = 0;
        for (KhoaHoc i: dsmh){
            hp += i.TongHocPhi();
        }
        return hp;
    }

    @Override
    public void InDS() {
        System.out.println("Tên học kỳ: " + ten);
        for(KhoaHoc i: dsmh){
            System.out.println("Môn: " + i.ten + " - Tin chỉ: " + i.TongTinChi()+ " - Học phí: " + i.TongHocPhi());
        }
    }
}
