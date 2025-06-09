package bt_java.baitap_them.decorator;

public class ImageMain {
    public static void main(String[] args) {
        ImageProcess image = new BasicImageProcess("anh1");
        ImageProcess deco = new BorderDecorator(new FilterDecorator(image));
        deco.process();
    }
}
