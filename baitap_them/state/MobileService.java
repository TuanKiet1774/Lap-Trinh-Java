package bt_java.baitap_them.state;

public class MobileService {
    public IState state;
    int soDu;
    String tenTB;

    public MobileService(IState state, int soDu, String tenTB) {
        this.state = state;
        this.soDu = soDu;
        this.tenTB = tenTB;
    }

    public void napTien(int soTien){
        state.xuLyNapTien(soTien, this);
    }

    public void goiDien(int soGiay){
        state.xuLyGoiDien(soGiay, this);
    }

    public void inThongTin(){
        state.xuLyInThongTin(this);
    }

    public void setState(IState state) {
        this.state = state;
    }
}
