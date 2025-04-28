package bt_java.baitap_cb1;

public class MenhGiaThapNhat extends MenhGiaATM{
    public MenhGiaThapNhat(int giaTri) {
        super(giaTri);
    }

    @Override
    public MenhGiaATM thietLapKeTiep(MenhGiaATM keTiep) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / this.giaTri;
        System.out.println(soTo + " Mênh giá " + this.giaTri + " nghìn VND");
    }
}
