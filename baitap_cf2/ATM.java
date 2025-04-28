package bt_java.baitap_cf2;

public class ATM {
    ATM_State s;
    int soTien;

    public ATM(){
        s = new HetTien();
        soTien = 0;
    }

    public void setState(ATM_State s){
        this.s = s;
    }

    public void napTien(int soTien){
        s.xuLyNhapTien(soTien,this);
    }

    public void rutTien(){
        s.xuLyRutTien(this);
    }
}
