package bt_java.baitap_a6;

public class UI {
    private DataAccess dataAccess;

    public UI(){
        dataAccess = DataAccess.getInstance();
    }

    public void Add_P(SanPham sp){
        dataAccess.Add_P(sp);
    }

    public void Delete_P(String p_ID){
        dataAccess.Delete_P(p_ID);
    }

    public void Update_P(SanPham sp){
        dataAccess.Update_P(sp);
    }

    public void Display(){
        for(SanPham sp:dataAccess.getDs_SanPham()){
            System.out.println("Mã sản phẩm: " + sp.getP_ID());
            System.out.println("Tên sản phẩm: " + sp.getP_Name());
            System.out.println("Số lượng: " + sp.getP_Count());
            System.out.println("Đơn giá: " + sp.getP_Price());
            System.out.println("---------------------------");
        }
    }
}
