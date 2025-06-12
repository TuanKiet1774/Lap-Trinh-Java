package ThiCK.OnTap.DuyAn_State;

public class BacState_An implements IState_An{
    @Override
    public double chietKhau_An(KhachHang_An kh) {
        if(kh.getDiemTichLuy_An() >= 2000){
            System.out.println("Bạn được chuyển qua khách hàng Vàng, được chiết khấu 3%");
            kh.setState_An(new VangState_An());
            return 0.03;
        }
        System.out.println("Bạn đang là khách hàng Bạc, được chiết khấu 2%");
        return 0.02;
    }

    @Override
    public String getTrangThai() {
        return "Bạc";
    }



}
