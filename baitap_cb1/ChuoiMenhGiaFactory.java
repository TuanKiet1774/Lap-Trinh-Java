package bt_java.baitap_cb1;

public abstract class ChuoiMenhGiaFactory {
    protected abstract MenhGiaATM getChuoiMenhGia(int menhGia);

    public void rutTien(int soTien, int menhGiaCaoNhat){
        getChuoiMenhGia(menhGiaCaoNhat);
    }
}
