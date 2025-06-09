package bt_java.baitap_ca4;

public abstract class Member implements TopicListener{
    Topic topic;
    String name;

    public Member(Topic topic, String name) {
        this.topic = topic;
        this.name = name;
        //Thực hiện đăng ký luôn. Có dòng này mới nhận được thông báo
        this.topic.attach(this);
    }
}
