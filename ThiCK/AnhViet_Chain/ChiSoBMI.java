package ThiCK.OnTap.AnhViet_Chain;

public abstract class ChiSoBMI {
    protected String tenNhom;
    protected float min, max;

    public ChiSoBMI(String tenNhom, float min, float max) {
        this.tenNhom = tenNhom;
        this.min = min;
        this.max = max;
    }

    public float tinhBMI(int chieuCao, int canNang) {
        float h = chieuCao / 100.f;
        return canNang / (h * h);
    }

    public abstract String xepLoai(float bmi);
    public abstract ChiSoBMI loaiKeTiep(ChiSoBMI kt);
}

