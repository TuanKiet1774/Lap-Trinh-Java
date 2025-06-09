package bt_java.baitap_ca4;

import java.util.ArrayList;
import java.util.List;

public class Topic{
    public List<TopicListener> dslistener = new ArrayList<>();
    public List<News> dsNews = new ArrayList<>();
    int id =0;

    public  void attach(TopicListener listener){
        dslistener.add(listener);
    }

    public  void detach(TopicListener listener){
        dslistener.remove(listener);
    }

    public void insert(String content){
        News n = new News(++id, content);
        dsNews.add(n);
        for(var i: dslistener){
            i.insertListener(n);
        }
    }
}
