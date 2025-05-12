package ThiCK.OnTap.QuanHeKH;

public class QuanHe_ThanThiet implements ICusState{
    private static QuanHe_ThanThiet instance;
    protected QuanHe_ThanThiet(){

    }

    public static QuanHe_ThanThiet getInstance(){
        if(instance == null){
            instance = new QuanHe_ThanThiet();
        }
        return instance;
    }
    @Override
    public double getGiamGia() {
        return 0;
    }

    @Override
    public String getTrangThai() {
        return "thân thiết ";
    }

    @Override
    public int doiDiem(int diem) {
        return 0;
    }
}
