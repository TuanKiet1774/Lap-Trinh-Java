package ThiCK.OnTap.AnhViet_Chain;

public class LoaiKhac extends ChiSoBMI{
    ChiSoBMI keTiep;
    public LoaiKhac(String tenNhom, float min, float max) {
        super(tenNhom, min, max);
    }

    @Override
    public String xepLoai(float bmi) {
        if(bmi >= min && bmi < max)
            return tenNhom;
        else
            return this.keTiep.xepLoai(bmi);
    }

    @Override
    public ChiSoBMI loaiKeTiep(ChiSoBMI kt) {
        this.keTiep = kt;
        return this.keTiep;
    }
}
