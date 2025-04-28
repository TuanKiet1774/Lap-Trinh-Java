package bt_java.baitap_cb1;

public class MenhGia extends MenhGiaATM{
    MenhGiaATM keTiep;
    public MenhGia(int giaTri) {
        super(giaTri);
    }

    @Override
    public MenhGiaATM thietLapKeTiep(MenhGiaATM keTiep) {
        this.keTiep = keTiep;
        return keTiep;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / this.giaTri;
        int soDu = soTien % this.giaTri;
        if(soTo > 0){
            System.out.println(soTo + " Mênh giá " + this.giaTri + " nghìn VND");
        }
        if(soDu > 0){
            this.keTiep.rutTien(soDu);
        }
    }
}
