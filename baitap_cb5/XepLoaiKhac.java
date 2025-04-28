package bt_java.baitap_cb5;

public class XepLoaiKhac extends DSXepLoai{
    public DSXepLoai xlkt;
    public XepLoaiKhac(int diemMin, int diemMax, String xepLoai) {
        super(diemMin, diemMax);
        this.xepLoai = xepLoai;
    }

    @Override
    public String XepLoaiHS(int diem) {
        if(diem >= diemMin && diem <= diemMax)
            return getXepLoai();
        else
            return xlkt.XepLoaiHS(diem);
    }

    @Override
    public DSXepLoai loaiKeTiep(DSXepLoai lkt) {
        this.xlkt = lkt;
        return lkt;
    }
}
