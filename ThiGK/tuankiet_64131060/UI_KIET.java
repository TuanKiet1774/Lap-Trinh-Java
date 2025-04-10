package tuankiet_64131060;

public class UI_KIET {
    private GoldPriceController_KIET g;

    public UI_KIET(){
        g = GoldPriceController_KIET.getInstance_KIET();
    }

    public void them(Gold_KIET v){
        g.them(v);
    }

    public void xem(String ngay_KIET){
        for(int i = 0; i < g.getDS_KIET().size(); i++){
            Gold_KIET temp = g.getDS_KIET().get(i);
            if(temp.getNgay_Kiet() == ngay_KIET){
                System.out.println(temp.toString());
            }
        }
    }
}
