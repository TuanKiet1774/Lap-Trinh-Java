package ThiCK.OnTap.Nhat_State;

public class QuanHe_Vang implements ICusState{
    private static QuanHe_Vang instance;
    protected QuanHe_Vang(){

    }

    public static QuanHe_Vang getInstance(){
        if(instance == null){
            instance = new QuanHe_Vang();
        }
        return instance;
    }

    @Override
    public double getGiamGia() {
        return 0.03;
    }

    @Override
    public String getTrangThai() {
        return "vàng ";
    }

    @Override
    public int doiDiem(int diem) {
        return (diem / 10) * 1000;
    }
}
