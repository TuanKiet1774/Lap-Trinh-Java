package ontap.De_Nhat;

public class MonHoc_Nhat {
    String maMH;
    String tenMH;
    int soTC;

    public MonHoc_Nhat(String maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return  tenMH +" ("+ maMH +") - Số tin chỉ: " + soTC ;
    }
}
