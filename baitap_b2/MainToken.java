package bt_java.baitap_b2;

public class MainToken {
    public static void main(String[] args) {
        String s = "Xin chào bạn mới và hôm nay trời đẹp.";
        Tokenize t = new TachTu(s);
        System.out.println("Tách từ: " + t.tokenize());
        t = new LoaiBoDauCau(t);
        System.out.println("Bỏ dấu: " + t.tokenize());
        t = new LoaiBoTuDung(t);
        System.out.println("Bỏ từ: " + t.tokenize());

    }
}
