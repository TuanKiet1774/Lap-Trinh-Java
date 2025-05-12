package ThiCK.OnTap.QuanHeKH;

public class QuanHe_Bac implements ICusState{
    private static QuanHe_Bac instance;
    protected QuanHe_Bac(){

    }

    public static QuanHe_Bac getInstance(){
        if(instance == null){
            instance = new QuanHe_Bac();
        }
        return instance;
    }

    @Override
    public double getGiamGia() {
        return 0.02;
    }

    @Override
    public String getTrangThai() {
        return "bạc ";
    }

    @Override
    public int doiDiem(int diem) {
        return 0;
    }
}
