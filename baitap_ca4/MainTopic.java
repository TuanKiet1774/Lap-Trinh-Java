package bt_java.baitap_ca4;

public class MainTopic {
    public static void main(String[] args) {
        Topic t = new Topic();
        Member ma = new MemberA(t,"Tuan Kiet");
        Member mb = new MemberB(t,"Minh Bảo");
        t.insert("Ngay mai nghỉ học\n");
        t.insert("Ngay mốt thi\n");
    }
}
