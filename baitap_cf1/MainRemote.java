package bt_java.baitap_cf1;

public class MainRemote {
    public static void main(String[] args) {
        TV tv = new TV();
        AdvanceRemote r = new AdvanceRemote(tv);
        r.togglePower();
        for(int i = 1; i<=10; i++)
        {
            r.volumeUp();
        }
        r.mute();
        r.mute();
    }
}
