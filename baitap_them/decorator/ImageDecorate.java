package bt_java.baitap_them.decorator;

public abstract class ImageDecorate implements ImageProcess {
    ImageProcess image;

    public ImageDecorate(ImageProcess image) {
        this.image = image;
    }

    @Override
    public void process() {
        image.process();
    }
}
