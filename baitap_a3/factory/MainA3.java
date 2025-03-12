package bt_java.baitap_a3.factory;

public class MainA3 {
    public static void main(String[] args) {
        shapefactory f = new shapefactory();
        shape rec = f.createShape(shapeType.Rectangle);
        System.out.println(rec.draw());
    }
}
