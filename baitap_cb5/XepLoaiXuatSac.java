package bt_java.baitap_cb5;

public class XepLoaiXuatSac extends DSXepLoai{
    public XepLoaiXuatSac(int diemMin, int diemMax, String xepLoai) {
        super(diemMin, diemMax);
        this.xepLoai = xepLoai;
    }

    @Override
    public String XepLoaiHS(int diem) {
        return getXepLoai();
    }

    @Override
    public DSXepLoai loaiKeTiep(DSXepLoai lkt) {
        return null;
    }
}
