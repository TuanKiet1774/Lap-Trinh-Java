package bt_java.baitap_ca4;

import java.util.ArrayList;
import java.util.List;

public class MemberB extends Member{
    List<News> dsNews = new ArrayList<>();
    public MemberB(Topic topic, String name) {
        super(topic, name);
    }

    @Override
    public void insertListener(News n) {
        dsNews.add(n);
        System.out.println(name);
        for(var i: dsNews){
            System.out.println(i.toString());
        }
    }

    @Override
    public void updateListener(News n) {

    }
}
