package bt_java.baitap_ca6;

public class MainPlayer {
    public static void main(String[] args) {
        //1. Tạo subject
        PlayerData pl1 = new PlayerData();
        //2. Tạo các DashBoard
        DashBoard d1 = new DashBoard("Màn hình chính");
        DashBoard d2 = new DashBoard("Thanh Trạng Thái");
        //3.Đăng ký dashboard với playerdata
        pl1.addOb(d1);
        pl1.addOb(d2);
        //4. Mô phỏng
        System.out.println("----START----");
        pl1.setPlayerData(3000,5,1500);
    }
}
