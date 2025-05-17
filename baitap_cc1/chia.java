package bt_java.baitap_cc1;

public class chia implements Tinh{
    @Override
    public float tinhToan(float a, float b) {
        if(b == 0){
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }
}
