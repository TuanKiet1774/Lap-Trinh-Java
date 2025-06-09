package ThiCK.OnTap.DuyAn_State;

import java.util.List;

public class KhachHang_An {
    private int diemTichLuy_An;
    private IState_An state_An;
    private List<MatHang_An> mhs_An;

    public KhachHang_An(List<MatHang_An> mhs_An) {
        setState_An(new ThanThietState_An());
        this.mhs_An = mhs_An;
        setDiemTichLuy_An();
        state_An.chietKhau_An(this);
    }

    public int getDiemTichLuy_An() {
        return diemTichLuy_An;
    }

    public void setDiemTichLuy_An() {
        int tongTien = 0;
        for(var mh : mhs_An){
            tongTien += mh.getDonGia() * mh.getSoLuong();
        }
        diemTichLuy_An += tongTien/5000;
    }

    public IState_An getState_An() {
        return state_An;
    }

    public void setState_An(IState_An state_An) {
        this.state_An = state_An;
    }

    public List<MatHang_An> getMhs_An() {
        return mhs_An;
    }

    public void setMhs_An(List<MatHang_An> mhs_An) {
        this.mhs_An = mhs_An;
        setDiemTichLuy_An();
    }

    public void inHoaDon_An(){
        int tongTien = 0;
        for(var mh : mhs_An){
            tongTien += mh.getDonGia() * mh.getSoLuong();
        }
        System.out.println("Tổng hoá đơn: "+tongTien);
        System.out.println("Tiền hoá đơn sau chiết khấu là: "+(tongTien - tongTien*state_An.chietKhau_An(this)));
        System.out.println("Điểm tích luỹ: "+diemTichLuy_An);
        System.out.println("Trạng thái khách hàng: "+state_An.getTrangThai());
    }

}
