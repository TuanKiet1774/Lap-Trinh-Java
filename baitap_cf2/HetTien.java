package bt_java.baitap_cf2;

public class HetTien implements ATM_State{
    @Override
    public void xuLyNhapTien(int soTien, ATM c) {
        c.soTien += soTien;
        if(c.soTien >= 5_000_000){
            c.setState(new SanSang());
        }
        else
            if(c.soTien > 0 && c.soTien < 5_000_000){
                c.setState(new HanChe());
            }
    }

    @Override
    public void xuLyRutTien(ATM c) {
        System.out.println("ATM hết tiền");
    }
}
