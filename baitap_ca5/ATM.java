package bt_java.baitap_ca5;

public class ATM{
    ATMListener theATM;

    void rutTien(int soTien){
        if(this.theATM == null){
            System.out.println("Mời đưa thẻ vào ATM");
            return;
        }

        if(theATM.kiemTraSoDu(soTien) == false)
            theATM.nhanThongBao(soTien,false);
        else
            theATM.nhanThongBao(soTien,true);
    }

    void nhanTheATM (ATMListener theATM){
        this.theATM = theATM;
    }

    void traTheATM(){
        this.theATM = null;
    }
}
