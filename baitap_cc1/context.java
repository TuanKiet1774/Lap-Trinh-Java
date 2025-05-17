package bt_java.baitap_cc1;

public class context {
    private Tinh tinhToan;

    //Phương thức thiết thâp tính toán
    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    //Phương thức sử dụng tính toán
    public float tinh(float a, float b){
        if(tinhToan == null){
            throw new IllegalArgumentException("Phép tình chưa được chọn");
        }
        return tinhToan.tinhToan(a,b);
    }
}
