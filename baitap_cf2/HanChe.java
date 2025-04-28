package bt_java.baitap_cf2;

import java.util.Scanner;

public class HanChe implements ATM_State {
    @Override
    public void xuLyNhapTien(int soTien, ATM c) {
        c.soTien += soTien;
        if(c.soTien >= 5_000_000){
            c.setState(new SanSang());
        }
    }

    @Override
    public void xuLyRutTien(ATM c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền tối đa: " + c.soTien);
        int kq = scanner.nextInt();
        if(kq > c.soTien){
            System.out.println("Không đủ để rút");
        }
        else{
            c.soTien -= kq;
            System.out.println("Mời nhận: " + kq);
        }

        if(c.soTien == 0){
            c.setState(new HetTien());
        }
    }
}
