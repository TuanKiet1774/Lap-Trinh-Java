package bt_java.baitap_a3.factory;

public class rectangle extends shape {
    private static rectangle instance;

    public rectangle() {
        super("rectangle brush", "rectangle paper", "rectangle frame");
    }

    public static rectangle getInstance(){
        if(instance == null){
            instance = new rectangle();
        }
        return instance;
    }

    @Override
    public String draw() {
        return "Vẽ hình chữ nhật" + paper;
    }
}
