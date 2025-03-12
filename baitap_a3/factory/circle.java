package bt_java.baitap_a3.factory;

public class circle extends shape {
    private static circle instance;

    private circle() {
        super("Circle brush", "Circle paper", "Circle frame");
    }

    public static circle getInstance(){
        if(instance == null){
            instance = new circle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Vẽ hình = "+ brush;
    }
}
