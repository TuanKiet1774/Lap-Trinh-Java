package ontap.De_DuyAn;

import java.util.ArrayList;
import java.util.List;

public class GioHang_AN {
    private static GioHang_AN instance;
    private List<SanPham_AN> dssp;

    protected GioHang_AN(){
        dssp = new ArrayList<>();
    }

    public static GioHang_AN getInstance_AN(){
        if(instance == null){
            instance = new GioHang_AN();
        }
        return instance;
    }

    public void them_AN(SanPham_AN sp){
        dssp.add(sp);
    }

    public void xoa_AN(SanPham_AN sp){
        dssp.remove(sp);
    }

    public void toString_AN() {
        float tongTien = 0;
        for(var sp : dssp){
            float tien = sp.donGia * sp.soLuong;
            tongTien += tien;
            System.out.println(sp.toString());
            System.out.println("Tổng tiền mặt hàng: " + tien);
        }
        System.out.println("Tổng tiền cần thanh toán: " + tongTien);
    }
}
