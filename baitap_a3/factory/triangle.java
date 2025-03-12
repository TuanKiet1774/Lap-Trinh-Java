package bt_java.baitap_a3.factory;

public class triangle extends shape{
    private static triangle instance;

    public triangle() {
        super("triangle brush", "triangle paper", "triangle frame");
    }

    public static triangle getInstance(){
        if(instance == null){
            instance = new triangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Vẽ hình tam giác" + frame;
    }
}
