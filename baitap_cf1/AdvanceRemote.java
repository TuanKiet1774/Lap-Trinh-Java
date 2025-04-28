package bt_java.baitap_cf1;

public class AdvanceRemote extends Remote {
    int volumeMemo;
    boolean isMute = false;

    public AdvanceRemote(Device d) {
        super(d);
    }

    public void mute(){
        if(isMute) {
            this.getD().setVolume(volumeMemo);
            System.out.println("Volume: " + this.getD().getVolume());
            isMute = false;
        }
        else{
                volumeMemo = this.getD().getVolume();
                this.getD().setVolume(0);
                System.out.println("Volume: " + this.getD().getVolume());
                isMute = true;
        }
    }
}
