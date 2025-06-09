package bt_java.baitap_them.decorator;

public class BorderDecorator extends ImageDecorate{
    public BorderDecorator(ImageProcess image) {
        super(image);
    }

    void addBorder(){
        System.out.println(" - Thêm khung");
    }

    @Override
    public void process() {
        super.process();
        addBorder();
    }
}
