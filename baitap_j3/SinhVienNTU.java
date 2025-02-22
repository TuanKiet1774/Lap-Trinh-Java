package bt_java.baitap_j3;

public abstract class SinhVienNTU {
    private String hoTen;
    private String nganh;

    public SinhVienNTU(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract float getDiemTB();

    public String getHocLuc() {
        float dtb = getDiemTB();

        if(dtb >= 9.0)
            return "Xuat sac";
        else if(dtb >= 8.0)
            return "Gioi";
        else if(dtb >= 6.5)
            return "Kha";
        else if (dtb >= 5.0)
            return "Trung Binh";
        else
            return "Kem";
    }

    public void inThongTin(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nganh hoc: " +nganh);
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
}
