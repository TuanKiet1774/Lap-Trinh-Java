package bt_java.baitap_ca4;

public class News {
    public int id;
    public String content;

    public News(int id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return id + ". " + content;
    }
}
