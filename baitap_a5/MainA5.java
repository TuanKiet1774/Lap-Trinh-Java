package bt_java.baitap_a5;

public class MainA5 {
    public static void main(String[] args) {
        Book b = new Book.Builder().buildTuaDe("No.1 Sentai GOzyuger").AddChuong("Chương 1").Build();
        System.out.println(b);
    }
}
