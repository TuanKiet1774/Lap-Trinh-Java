package bt_java.baitap_b1;

public class Nhan extends BieuThucDecorate{
    private float toanHang;

    public Nhan(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() * toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + super.bieuThuc() + ") * " +toanHang ;
    }
}
