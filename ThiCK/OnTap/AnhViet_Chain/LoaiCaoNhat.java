package ThiCK.OnTap.AnhViet_Chain;

public class LoaiCaoNhat extends ChiSoBMI{

    public LoaiCaoNhat(String tenNhom, float min, float max) {
        super(tenNhom, min, max);
    }

    @Override
    public String xepLoai(float bmi) {
        return tenNhom;
    }

    @Override
    public ChiSoBMI loaiKeTiep(ChiSoBMI kt) {
        return null;
    }
}
