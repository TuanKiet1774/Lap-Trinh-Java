package bt_java.baitap_them.decorator;

public class WaterMarkDecorator extends ImageDecorate{
    public WaterMarkDecorator(ImageProcess image) {
        super(image);
    }

    void addWaterMark(){
        System.out.println(" - Chèn watermark");
    }

    @Override
    public void process() {
        super.process();
        addWaterMark();
    }
}
