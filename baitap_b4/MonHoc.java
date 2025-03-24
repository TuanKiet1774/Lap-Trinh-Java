package bt_java.baitap_b4;

public class MonHoc extends KhoaHoc{
    private int tinchi;
    private double hocphi;

    public MonHoc(String ten, int tinchi, double hocphi) {
        super(ten);
        this.tinchi = tinchi;
        this.hocphi = hocphi;
    }

    public int getTinchi() {
        return tinchi;
    }

    public double getHocphi() {
        return hocphi;
    }

    @Override
    public int TongTinChi() {
        return tinchi;
    }

    @Override
    public double TongHocPhi() {
        return hocphi * tinchi;
    }

    @Override
    public void InDS() {
        System.out.println("Môn hoc: " + ten + " |Tin chỉ: " + tinchi + " |Học phí: " + TongHocPhi());
    }
}
