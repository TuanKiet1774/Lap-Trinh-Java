package bt_java.baitap_cf2;

import java.util.Scanner;

public class SanSang implements ATM_State{
    @Override
    public void xuLyNhapTien(int soTien, ATM c) {
        c.soTien += soTien;
    }

    @Override
    public void xuLyRutTien(ATM c) {
        System.out.println("1. 5.000.000\n2. 3.000.000 \n->Lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        int kq = scanner.nextInt();
        switch (kq){
            case 1:
                c.soTien -= 5_000_000;
                System.out.println("Mời nhận 5000000");
                break;
            case 2:
                c.soTien -= 3_000_000;
                System.out.println("Mời nhận 3000000");
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
        if(c.soTien == 0){
            c.setState(new HetTien());
        }
        else {
            if(c.soTien < 5_000_000){
                c.setState(new HanChe());
            }
        }
    }
}
