package bt_java.baitap_a4;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Election {
    private int trumCount, bidenCount;
    private static Election instance;
    private Set<String> voters;

    Election(){
        trumCount = 0;
        bidenCount = 0;
        voters = new HashSet<>();
    }

    //Khởi tạo kiểu lazy, chỉ khởi tạo khi dùng
    public static Election getInstance() {
        if(instance == null )
            instance = new Election();
        return instance;
    }
    public void vote(Candidate c, User u)
    {
        if(voters.contains(u.getName())) {
            System.out.println(u.getName() + " đã đi bầu");
            return;
        }
        else
            voters.add(u.getName());
        switch (c) {
            case Trump:
                trumCount++;
                break;
            case Biden:
                bidenCount++;
                break;
        }
    }

    public void inKetQua(){
        System.out.println("Trump " + trumCount);
        System.out.println("Biden " + bidenCount);
    }
}
