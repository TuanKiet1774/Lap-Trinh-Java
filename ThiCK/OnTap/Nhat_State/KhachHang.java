package ThiCK.OnTap.Nhat_State;

import java.util.List;

public class KhachHang {
    public String id, ten;
    public int diem;
    public ICusState state;

    public KhachHang(String id, String ten) {
        this.ten = ten;
        this.id = id;
        this.diem = 0;
        this.state = QuanHe_ThanThiet.getInstance();
    }

    public String muaHang(List<MatHang> dsmh){
        double sum = 0;
        for (var i : dsmh){
            sum += i.thanhTien();
        }

        diem += (int)(sum / 5000);

        if (diem >= 200) {
            state = QuanHe_Vang.getInstance();
        } else if (diem >= 100) {
            state = QuanHe_Bac.getInstance();
        } else {
            state = QuanHe_ThanThiet.getInstance();
        }

        double giamGia = state.getGiamGia();
        double thanhTien = sum * (1 - giamGia);
        return "----- HÓA ĐƠN -----\n" +
                "- Khách hàng " + state.getTrangThai() + ten +
                "\n+ Tổng tiền: " + sum + " VNĐ" +
                "\n+ Giảm giá: " + (giamGia * 100) + "%" +
                "\n+ Thành tiền: " + thanhTien + " VNĐ" +
                "\n+ Điểm tích lũy: " + diem;
    }

    public int doiTienThuong(){
        return state.doiDiem(diem);
    }
}
