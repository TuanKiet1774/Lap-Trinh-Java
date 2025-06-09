package bt_java.baitap_them.state;

public class NormalState implements IState{
    @Override
    public void xuLyNapTien(int soTien, MobileService tb) {
        tb.soDu += soTien;
        if(tb.soDu > 100_000 && tb.soDu <= 200_000)
            tb.setState(new SilverState());
        else if(tb.soDu > 200_000)
            tb.setState(new GoldState());
    }

    @Override
    public void xuLyGoiDien(int soGiay, MobileService tb) {
        int cuocGoi = soGiay * (1800/60);
        tb.soDu = tb.soDu < cuocGoi ? 0 : tb.soDu - cuocGoi;
        System.out.println("Trạng thái: Thường");
        System.out.println("Số dư: " + tb.soDu);
    }

    @Override
    public void xuLyInThongTin(MobileService tb) {
        System.out.println("Trạng thái: Thường");
        System.out.println("Số dư: " + tb.soDu);
        System.out.println("Thời gian gọi còn lại: "+ tb.soDu/(1800/60) + "giây");
    }
}
