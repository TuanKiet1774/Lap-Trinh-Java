package bt_java.baitap_a3.factory;

public abstract class shape {
    protected String brush;
    protected String paper;
    protected String frame;

    public shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    public abstract String draw();
}
