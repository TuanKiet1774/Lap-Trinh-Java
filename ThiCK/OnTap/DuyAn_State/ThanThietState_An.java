package ThiCK.OnTap.DuyAn_State;

public class ThanThietState_An implements IState_An{

    @Override
    public double chietKhau_An(KhachHang_An kh) {
        if(kh.getDiemTichLuy_An()>=1000){
            if(kh.getDiemTichLuy_An()<2000){
                kh.setState_An(new BacState_An());
                System.out.println("Bạn được chuyển qua khách hàng Bạc, được chiết khấu 2%");
                return 0.02;
            }
            else {
                kh.setState_An(new VangState_An());
                System.out.println("Bạn được chuyển qua khách hàng Vàng, được chiết khấu 3%");
                return 0.03;
            }
        }
        System.out.println("Bạn đang là khách hàng Thân Thiết, không chiết khấu");
        return 0;
    }

    @Override
    public String getTrangThai() {
        return "Thân thiết";
    }

}
