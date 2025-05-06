package bt_java.baitap_cc2;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
    }
}
