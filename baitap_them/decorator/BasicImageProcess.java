package bt_java.baitap_them.decorator;

public class BasicImageProcess implements ImageProcess{
    String path;

    public BasicImageProcess(String path) {
        this.path = path;
    }


    @Override
    public void process() {
        System.out.println("c:\\" + path);
    }
}
