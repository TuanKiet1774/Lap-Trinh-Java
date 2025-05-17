package bt_java.baitap_ca1;

import java.util.ArrayList;
import java.util.List;

public class MonHocSubject {
    private List<Observer> dsob = new ArrayList<>();
    private List<String> dsmh = new ArrayList<>();

    //Phương thức đăng ky Observer == addListener
    public void dangKyObserver(Observer observer){
        if(!dsob.contains(observer)){
            dsob.add(observer);
        }
    }

    public void huyDangKyObserver(Observer observer){
        dsob.remove(observer);
    }

    //Tương đương với addEvent
    public void addMon(String ten){
        if(!dsmh.contains(ten)){
            dsmh.add(ten);
            System.out.println("["+ ten + "] đã được thêm vào danh sách MonHocSubjec");
            thongBao(); //Thông báo cho tất cả các Observer (Client) đã thêm
        }
        else{
            System.out.println("["+ ten + "] đã tồn tại trong danh sách MonHocSubjec");
        }
    }

    public void removeMon(String ten){
        if(dsmh.contains(ten)){
            dsmh.remove(ten);
            System.out.println("["+ ten + "] đã được xóa ra khỏi danh sách MonHocSubjec");
            thongBao(); //Thông báo cho các Observer (Client) đã xóa
        }
        else {
            System.out.println("["+ ten + "] không tồn tại trong danh sách MonHocSubjec");
        }
    }

    //Phương thức thông báo cho tất cả các observer, chỉ một mình Subject dùng phương thức này
    private void thongBao(){
        //Tạo ra một bản sao của dsmh tránh việc observer sửa đổi danh sách gốc
        List<String> dsTemp = new ArrayList<>(dsmh);
        for(var i: dsob){
            i.update(dsTemp);
        }
    }
}
