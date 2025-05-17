package bt_java.baitap_ca2;

public class MainButton {
    public static void main(String[] args) {
        //1. Tạo activity là Observer
        Activity a = new Activity("Click ra màn hình chính");
        //2. Tạo button là Subject
        Button b = new Button("Đăng nhập");
        //3. Thiết lập activity để lắng nghe sự kiện click từ button
        //Đăng ký Observer với Subject
        b.setClickListener(a);
        //4. Mô phỏng button được click
        b.perfromClick();
        b.perfromClick();
        b.perfromClick();

        System.out.println("Kiểm tra số lần click " + a.getAcName() + ": "  + a.getClickCount());

        Activity a1 = new Activity("Khởi động lại máy");
        Button b1 = new Button("Reset");
        //b1.setClickListener(a1);
        b1.perfromClick();
        System.out.println("Kiểm tra số lần click " + a1.getAcName() + ": "  + a1.getClickCount());
    }
}
