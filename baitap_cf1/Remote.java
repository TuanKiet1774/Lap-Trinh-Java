package bt_java.baitap_cf1;

public abstract class Remote {
    private Device d;

    public Remote(Device d) {
        this.d = d;
    }

    public void togglePower(){
        if(d.isEnable())
            d.disable();
        else
            d.enable();
    }

    public void volumeDown(){
        if(d.getVolume() >= 0) {
            int volume = d.getVolume();
            d.setVolume(volume - 1);
        }
        System.out.println("Volume: " + d.getVolume());
    }

    public void volumeUp(){
        if(d.getVolume() < 100) {
            int volume = d.getVolume();
            d.setVolume(volume + 1);
        }
        System.out.println("Volume: " + d.getVolume());
    }

    public Device getD() {
        return d;
    }
}
