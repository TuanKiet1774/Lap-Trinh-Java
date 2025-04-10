package tuankiet_64131060;

public class Gold_KIET {
    private String loai_KIET, ngay_Kiet;
    private int giaMua_KIET, giaBan_KIET;

    public Gold_KIET(String loai_KIET, String ngay_Kiet, int giaMua_KIET, int giaBan_KIET) {
        this.loai_KIET = loai_KIET;
        this.ngay_Kiet = ngay_Kiet;
        this.giaMua_KIET = giaMua_KIET;
        this.giaBan_KIET = giaBan_KIET;
    }

    public String getLoai_KIET() {
        return loai_KIET;
    }

    public String getNgay_Kiet() {
        return ngay_Kiet;
    }

    public int getGiaMua_KIET() {
        return giaMua_KIET;
    }

    public int getGiaBan_KIET() {
        return giaBan_KIET;
    }

    public void setLoai_KIET(String loai_KIET) {
        this.loai_KIET = loai_KIET;
    }

    public void setNgay_Kiet(String ngay_Kiet) {
        this.ngay_Kiet = ngay_Kiet;
    }

    public void setGiaMua_KIET(int giaMua_KIET) {
        this.giaMua_KIET = giaMua_KIET;
    }

    public void setGiaBan_KIET(int giaBan_KIET) {
        this.giaBan_KIET = giaBan_KIET;
    }

    @Override
    public String toString() {
        return "Date: " + ngay_Kiet + ":\n" +
                " + Loại: " + loai_KIET + "\n" +
                " + Giá mua: " + giaMua_KIET + "\n" +
                " + Giá bán: " + giaBan_KIET + "\n";
    }
}
