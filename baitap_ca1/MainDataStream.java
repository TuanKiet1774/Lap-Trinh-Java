package bt_java.baitap_ca1;

import java.util.ArrayList;
import java.util.List;

public class MainDataStream {
    public static void main(String[] args) {
        //1. Tạo subject
        MonHocSubject subject1 = new MonHocSubject();
        //2. Tạo các Observer
        Client client1 = new Client("Màn hình Deskstop");
        Client client2 = new Client("Thong bao Email");
        //3. Dang ky Observer với Subject
        subject1.dangKyObserver(client1);
        subject1.dangKyObserver(client2);
        //4. Thêm môn học trên Subject thì Observer sẽ tự cập nhật
        System.out.println("\nThêm môn học 1: ");
        subject1.addMon("Java");
        System.out.println("\nThêm môn học 2: ");
        subject1.addMon("C++");
        System.out.println("\nThêm môn học 3: ");
        subject1.addMon("HTML/CSS");

        System.out.println("\n---Xóa Môn Học---");
        subject1.huyDangKyObserver(client2);
        subject1.removeMon("Java");
    }
}
