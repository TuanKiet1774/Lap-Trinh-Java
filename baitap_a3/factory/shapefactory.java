package bt_java.baitap_a3.factory;

public class shapefactory {
    public shape createShape(shapeType t){
        switch (t){
            case Triangle:
                return triangle.getInstance();
            case Circle:
                return circle.getInstance();
            case Rectangle:
                return rectangle.getInstance();
            default:
                throw new IllegalArgumentException("Nhập sai rồi");
        }
    }
}
