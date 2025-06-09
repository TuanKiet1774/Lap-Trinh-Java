package bt_java.baitap_ca4;

public class MemberA extends Member{
    public MemberA(Topic topic, String name) {
        super(topic, name);
    }

    @Override
    public void insertListener(News n) {
        System.out.println(name);
        System.out.println(n.toString());
    }

    @Override
    public void updateListener(News n) {

    }
}
