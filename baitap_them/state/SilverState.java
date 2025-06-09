package bt_java.baitap_them.state;

public class SilverState implements IState {
    @Override
    public void xuLyNapTien(int soTien, MobileService tb) {
        tb.soDu += soTien * 105 / 100;
        if(tb.soDu > 200_000)
            tb.setState(new GoldState());
    }

    @Override
    public void xuLyGoiDien(int soGiay, MobileService tb) {
        int giaCuocGoi =  1500/60;
        if(tb.soDu - soGiay * giaCuocGoi > 100_000){
            tb.soDu -= soGiay * giaCuocGoi;
            System.out.println("Trạng thái: Bạc");
            System.out.println("Số dư: " + tb.soDu);
        }
        else{
            int tgBac = 0;
            for(;;){
                tgBac++;
                tb.soDu -= giaCuocGoi;
                if(tb.soDu <= 100_000)
                    break;
            }
            tb.setState(new NormalState());
            tb.goiDien(soGiay - tgBac);
        }
    }

    @Override
    public void xuLyInThongTin(MobileService tb) {
        System.out.println("Trạng thái: Bạc");
        System.out.println("Số dư: "+ tb.soDu);
        int tgBac = 0;
        int soDu = tb.soDu;
        int giaCuocGoi =  1500/60;
        for(;;){
            tgBac++;
            soDu -= giaCuocGoi;
            if(soDu <= 100_000)
                break;
        }
        int tgthuong = soDu / (1800/60);
        System.out.println("Thời gian gọi còn lại: " + (tgthuong + tgBac) + " giây");
    }
}
