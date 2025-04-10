package ontap.De_AViet;
import java.util.ArrayList;
import java.util.List;

public class TourDuLichViet {
    private String tenTour, thoiGian;
    private int giaTuor;
    private List<DiaDiemViet> dsDiaDiem;

    protected TourDuLichViet(Builder b) {
        this.tenTour = b.tenTour;
        this.thoiGian = b.thoiGian;
        this.giaTuor = b.giaTuor;
        this.dsDiaDiem = b.dsDiaDiem;
    }

    public String lichTrinh(List<DiaDiemViet> ds){
        StringBuilder b = new StringBuilder();
        for(DiaDiemViet i: ds){
            b.append(" + ").append(i).append("\n");
        }
        return b.toString();
    }

    @Override
    public String toString() {
        return "[THÔNG TIN VỀ TOUR DU LỊCH VIỆT] \n" +
                "1. Tên tour du lịch: "+ tenTour +"\n" +
                "2. Thời gian: " + thoiGian + "\n" +
                "3. Giá tiền: " + giaTuor + "\n" +
                "4. Lịch trình: \n" + lichTrinh(dsDiaDiem) + "\n";
    }

    public static class Builder {
        private String tenTour, thoiGian;
        private int giaTuor;
        private List<DiaDiemViet> dsDiaDiem = new ArrayList<>();

        public Builder addTenTour(String tenTour) {
            this.tenTour = tenTour;
            return this;
        }
        public Builder addGiaTour(int giaTuor) {
            this.giaTuor = giaTuor;
            return this;
        }
        public Builder addThoiGian(String thoiGian) {
            this.thoiGian = thoiGian;
            return this;
        }
        public Builder addDsDiaDiem(DiaDiemViet diaDiem) {
            dsDiaDiem.add(diaDiem);
            return this;
        }
        public TourDuLichViet build() {return new TourDuLichViet(this);}
    }

}
