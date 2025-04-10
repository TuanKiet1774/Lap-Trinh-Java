package ontap.De_AViet;

public class MainTourDuLichViet {
    public static void main(String[] args) {
        DiaDiemViet dd1 = new DiaDiemViet("Cà Mau", "đi Chợ Nổi Cà Màu", "vào buổi sáng ngày đầu tiên");
        DiaDiemViet dd2 = new DiaDiemViet("An Giang", "đi chùa Thất Sơn", "vào buổi chiều ngày đầu tiên");
        DiaDiemViet dd3 = new DiaDiemViet("Long Xuyên", "đi chơi dạo vòng quanh thành phố", "vào ngày thứ 2");
        TourDuLichViet tourDuLichViet = new TourDuLichViet.Builder()
                .addTenTour("Chuyến du lịch miền Tây")
                .addGiaTour(23_750_000)
                .addThoiGian("2 ngày 1 đêm")
                .addDsDiaDiem(dd1)
                .addDsDiaDiem(dd2)
                .addDsDiaDiem(dd3)
                .build();

        HeThongLuuTruViet ht = HeThongLuuTruViet.getInstance();
        ht.addTour("2N1D",tourDuLichViet);
        System.out.println("=====HỆ THỐNG LƯU TRỮ TOUR DU LICH VIET=====");
        ht.hienThi();
    }
}
