package bt_java.baitap_a6;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance; //Định dạng
    private List<SanPham> ds_SanPham;

    DataAccess(){ //Khai báo
        ds_SanPham = new ArrayList<>();
    }

    public static DataAccess getInstance() { //Cho dùng
        if(instance == null)
            instance = new DataAccess();
        return instance;
    }

    public void Add_P(SanPham sp){
        ds_SanPham.add(sp);
    }

    public void Delete_P(String p_ID){
        ds_SanPham.remove(p_ID);
    }

    public void Update_P(SanPham sp){
        for(int i = 0; i < ds_SanPham.size(); i++) {
            if(ds_SanPham.get(i).getP_ID() == sp.getP_ID()) {
                ds_SanPham.get(i).setP_Name(sp.getP_Name());
                ds_SanPham.get(i).setP_Count(sp.getP_Count());
                ds_SanPham.get(i).setP_Price(sp.getP_Price());
            }
        }
    }

    public List<SanPham> getDs_SanPham(){
        return ds_SanPham;
    }
}
