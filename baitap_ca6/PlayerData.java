package bt_java.baitap_ca6;

import java.util.ArrayList;
import java.util.List;

public class PlayerData {
    private List<DashBoardObserver> dsob = new ArrayList<>();
    private int thoiGian, countDown, grade;

    public void addOb (DashBoardObserver ob){
        if(!dsob.contains(ob)){
            dsob.add(ob);
        }
    }

    public void removeOb (DashBoardObserver ob){
        if(dsob.contains(ob)){
            dsob.remove(ob);
        }
    }

    private void thongBao(){
        List<DashBoardObserver> dstemp = new ArrayList<>(dsob);
        for(var i: dstemp){
            i.update(this.thoiGian, this.countDown, this.grade);
        }
    }

    public void setPlayerData(int thoiGian, int countDown, int grade){
        this.thoiGian = thoiGian;
        this.countDown = countDown;
        this.grade = grade;
        System.out.println("\n[PlayerData] Dữ liệu người chơi đã thay đổi ");
        thongBao();
    }
}
