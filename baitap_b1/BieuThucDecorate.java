package bt_java.baitap_b1;

public class BieuThucDecorate extends BieuThuc{
    BieuThuc bieuThuc;

    public BieuThucDecorate(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
