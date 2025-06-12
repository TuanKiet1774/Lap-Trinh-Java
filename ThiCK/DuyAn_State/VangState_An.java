package ThiCK.OnTap.DuyAn_State;

public class VangState_An implements IState_An{
    @Override
    public double chietKhau_An(KhachHang_An kh) {
        System.out.println("Bạn đang là khách hàng Vàng, được chiết khấu 3%");
        return 0.03;
    }

    @Override
    public String getTrangThai() {
        return "Vang";
    }

}
