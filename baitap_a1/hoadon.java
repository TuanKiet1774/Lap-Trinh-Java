package bt_java.baitap_a1;

import java.util.ArrayList;
import java.util.List;

public class hoadon {
    private hoadonHeader hdHeader;
    private List<chitiethoadon> cthds;

    public hoadon(Builder h) {
        this.hdHeader = h.hdHeader;
        this.cthds = h.cthds;
    }

    public double getTongTien(){
        double tong = 0;
        for(chitiethoadon item : cthds){
            tong += item.getThanhTien();
        }
        return tong;
    }

    @Override
    public String toString() {
        return "hoadon{" +
                "hdHeader=" + hdHeader +
                ", cthds=" + cthds +
                ", tổng tiền = " + getTongTien() +
                '}';
    }

    public static class Builder{
        private hoadonHeader hdHeader;
        private List<chitiethoadon> cthds = new ArrayList<>();

        public Builder builheader(String mahd, String ngay, String tenkh){
            this.hdHeader = new hoadonHeader(mahd,tenkh,ngay);
            return this;
        }

        public Builder addCthd(chitiethoadon cthd){
            this.cthds.add(cthd);
            return this;
        }

        public hoadon build()
        {
            return new hoadon(this);
        }

    }
}
