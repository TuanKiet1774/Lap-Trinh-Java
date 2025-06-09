package bt_java.baitap_them.decorator;

public class FilterDecorator extends ImageDecorate{
    public FilterDecorator(ImageProcess image) {
        super(image);
    }

    void addFilter(){
        System.out.println(" - Thêm hiệu ứng");
    }

    @Override
    public void process() {
        super.process();
        addFilter();
    }
}
