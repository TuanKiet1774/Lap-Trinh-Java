package bt_java.baitap_j3;

public class SinhVienIT extends SinhVienNTU {
    private float diemJava, diemCSS, diemHTML;

    public SinhVienIT(String hoTen, String nganh,float diemJava, float diemCSS, float diemHTML) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public float getDiemTB() {
        return (diemJava * 2 + diemCSS + diemHTML) / 4;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Diem: ");
        System.out.println("Java: " + diemJava + " CSS: " + diemCSS + " HTML: " + diemHTML);
        System.out.println("Diem tb: " + getDiemTB());
        System.out.println("Hoc luc: " + getHocLuc());
        System.out.println();
    }

    public float getDiemJava() {
        return diemJava;
    }

    public float getDiemCSS() {
        return diemCSS;
    }

    public float getDiemHTML() {
        return diemHTML;
    }

    public void setDiemJava(float diemJava) {
        this.diemJava = diemJava;
    }

    public void setDiemCSS(float diemCSS) {
        this.diemCSS = diemCSS;
    }

    public void setDiemHTML(float diemHTML) {
        this.diemHTML = diemHTML;
    }
}

