package bt_java.baitap_ca5;

public class TaiKhoan implements ATMListener{
    String tenTK;
    int soDu;
    ATM atm;

    public TaiKhoan(String tenTK, int soDu, ATM atm) {
        this.tenTK = tenTK;
        this.soDu = soDu;
        this.atm = atm;
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        return soDu - soTien >= 50000;
    }

    @Override
    public void nhanThongBao(int soTien, boolean thanhCong) {
        if (!thanhCong){
            System.out.println("Số tiền rút: " + soTien);
            System.out.println("Rút tiền không thành công");
            System.out.println("Số dư cuối: " + soDu);
        }
        else{
            System.out.println("Số dư: " + soDu);
            System.out.println("Số tiền rút: " + soTien);
            soDu = soDu - soTien;
            System.out.println("Số dư hiện tại: " + soDu);
        }
    }

    public void duaTheVao(){
        this.atm.nhanTheATM(this);
    }
    public void rutTheATM(){
        this.atm.traTheATM();
    }
}
