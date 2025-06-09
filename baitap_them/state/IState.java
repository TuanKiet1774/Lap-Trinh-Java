package bt_java.baitap_them.state;

public interface IState {
    void xuLyNapTien(int soTien, MobileService tb);
    void xuLyGoiDien(int soGiay, MobileService tb);
    void xuLyInThongTin(MobileService tb);
}
