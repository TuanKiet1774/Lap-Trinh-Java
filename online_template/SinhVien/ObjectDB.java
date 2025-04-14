package behavioral.template.SinhVien;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectDB<T>{
    private List<T> ds = new ArrayList<>();

    public abstract int getID(T t);

    T findMyID(int id){
        for(var t : ds){
            if(getID(t) == id)
                return t;
        }
        return null;
    }

    public void add(T t){
        for(var o: ds){
            if(getID(o) == getID(t))
                return;
        }
        ds.add(t);
    }

    public void update(T t){
        for(int i = 0; i<ds.size(); i++){
            if(getID(ds.get(i)) == getID(t)){
                ds.set(i,t);
                return;
            }
        }
    }

    public void deleteByID(int id){
        for(var o : ds){
            if(getID(o) == id){
                ds.remove(o);
                return;
            }
        }
    }

    public void hienThiDS(){
        for(var i: ds){
            System.out.println(i.toString());
        }
    }
}
