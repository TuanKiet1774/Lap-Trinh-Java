package ontap.De_Nhat;

import java.util.HashMap;
import java.util.Map;

public class HeThongLuuTru_Nhat {
    private static HeThongLuuTru_Nhat instance;
    private Map<String, KeHoachHocTap_Nhat> htlt;

    protected HeThongLuuTru_Nhat(){
        htlt = new HashMap<>();
    }

    public static HeThongLuuTru_Nhat getInstance(){
        if(instance == null){
            instance = new HeThongLuuTru_Nhat();
        }
        return instance;
    }

    public void addKH(String mssv, KeHoachHocTap_Nhat kt){
        htlt.put(mssv,kt);
    }

    public void hienThiKH(){
        for(String i: htlt.keySet()){
            htlt.get(i).hienThi();
        }
    }
}
