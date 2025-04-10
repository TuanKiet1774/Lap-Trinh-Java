package tuankiet_64131060;

import java.util.ArrayList;
import java.util.List;

public class GoldPriceController_KIET {
    private static GoldPriceController_KIET instance_KIET;
    private String loai_KIET, ngay_KIET;
    private int giaMua_KIET, giaBan_KIET;
    private List<Gold_KIET> ds_KIET;

    protected GoldPriceController_KIET(){
        ds_KIET = new ArrayList<>();
    }

    public static GoldPriceController_KIET getInstance_KIET(){
        if(instance_KIET == null){
            instance_KIET = new GoldPriceController_KIET();
        }
        return instance_KIET;
    }

    public void them(Gold_KIET v){
        ds_KIET.add(v);
    }

    public void xem(String ngay_KIET){
        for(int i = 0; i<ds_KIET.size(); i++){
            Gold_KIET temp = ds_KIET.get(i);
            if(temp.getNgay_Kiet() == ngay_KIET){
                System.out.println(temp.toString());
            }
        }
    }

    public List<Gold_KIET> getDS_KIET(){
        return ds_KIET;
    }
}
