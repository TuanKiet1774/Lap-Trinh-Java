package bt_java.baitap_b1;

public class Tru extends BieuThucDecorate{
    private float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return super.giaTri() - toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() + " - " +toanHang;
    }
}
