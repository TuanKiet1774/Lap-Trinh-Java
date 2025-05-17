package bt_java.baitap_ca1;

import java.util.ArrayList;
import java.util.List;

public class Client implements Observer{
    private String clientName;
    private List<String> hienThiMon = new ArrayList<>();

    public Client(String clientName) {
        this.clientName = clientName;
    }

    public void hienThi(){
        System.out.println("-----HIỂN THỊ TỪ CLIENT ["+ clientName +"]-----");
        if(hienThiMon.isEmpty()){
            System.out.println("Chưa có môn học trong danh sách của " + clientName);
        }
        else {
            int stt = 1;
            for(var i : hienThiMon){
                System.out.println(stt + ". " + i);
            }
        }
    }

    @Override
    public void update(List<String> dsmh) {
        this.hienThiMon = dsmh; //Cập nhật danh sách môn học
        System.out.println("[" + clientName + "] nhận được cập nhật danh sách môn học");
        hienThi();
    }
}
