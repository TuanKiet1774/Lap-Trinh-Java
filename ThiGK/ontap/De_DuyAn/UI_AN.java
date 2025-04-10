package ontap.De_DuyAn;

public class UI_AN {
    private GioHang_AN gh;

    public UI_AN(){
        gh = GioHang_AN.getInstance_AN();
    }

    public void them(SanPham_AN sp){
        gh.them_AN(sp);
    }

    public void xoa(SanPham_AN sp){
        gh.xoa_AN(sp);
    }

    public void hienThi_AN(){
        gh.toString_AN();
    }
}
