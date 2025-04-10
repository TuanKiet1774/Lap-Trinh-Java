package ontap.De_AViet;
import java.util.HashMap;
import java.util.Map;

public class HeThongLuuTruViet {
    private static HeThongLuuTruViet instance;
    private Map<String, TourDuLichViet> htlt;

    protected HeThongLuuTruViet() {
        htlt = new HashMap<>();
    }

    public static HeThongLuuTruViet getInstance(){
        if(instance == null){
            instance = new HeThongLuuTruViet();
        }
        return instance;
    }

    public void addTour(String maTour, TourDuLichViet t){
        htlt.put(maTour,t);
    }

    public void hienThi(){
        for(String i: htlt.keySet()){
            System.out.println(htlt.get(i).toString());
        }
    }
}
