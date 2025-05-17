package bt_java.baitap_ca6;

public class DashBoard implements DashBoardObserver{
    private String dashBoardID;
    private int currentThoiGian;
    private int currentCountDown;
    private int currentGrade;

    public DashBoard(String dashBoardID) {
        this.dashBoardID = dashBoardID;
    }

    public void hienThi(){
        System.out.println("-----HIỂN THỊ TỪ DASHBOARD ["+ dashBoardID +"]-----");
        System.out.println("Thời gian: " + this.currentThoiGian);
        System.out.println("Đếm ngược: " + this.currentCountDown);
        System.out.println("Điểm: " + this.currentGrade);
    }

    @Override
    public void update(int thoiGian, int countDown, int grade) {
        this.currentCountDown = countDown;
        this.currentThoiGian = thoiGian;
        this.currentGrade = grade;
        System.out.println("[" + dashBoardID + "] đã được cập nhật dữ liệu");
        hienThi();
    }
}
