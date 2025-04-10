package ontap.De_AViet;

public class DiaDiemViet {
    String tenDD;
    String diaChi;
    String thoiDiem;

    public DiaDiemViet(String tenDD, String diaChi, String thoiDiem) {
        this.tenDD = tenDD;
        this.diaChi = diaChi;
        this.thoiDiem = thoiDiem;
    }

    @Override
    public String toString() {
        return tenDD + ", " + diaChi + ", " + thoiDiem;
    }
}
