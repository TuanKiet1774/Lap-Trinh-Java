package bt_java.baitap_j3;

public class SinhVienBiz extends SinhVienNTU {
    private float diemMarketing, diemSales;

    public SinhVienBiz(String hoTen, String nganh, float diemMarketing, float diemSales) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public float getDiemTB() {
        return (diemMarketing * 2 + diemSales) / 3;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Diem: ");
        System.out.println("Marketing: " + diemMarketing + " Sales: " + diemSales);
        System.out.println("Diem tb: " + getDiemTB());
        System.out.println("Hoc luc: " + getHocLuc());
        System.out.println();
    }

    public float getDiemMarketing() {
        return diemMarketing;
    }

    public float getDiemSales() {
        return diemSales;
    }

    public void setDiemMarketing(float diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public void setDiemSales(float diemSales) {
        this.diemSales = diemSales;
    }
}
