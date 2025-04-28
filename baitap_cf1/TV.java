package bt_java.baitap_cf1;

public class TV implements Device {
    private int volume;
    private boolean enable = false;

    @Override
    public boolean isEnable() {
        return enable;
    }

    @Override
    public void enable() {
        System.out.println("Mở ti vi");
        enable = true;
    }

    @Override
    public void disable() {
        System.out.println("Tắt ti vi");
        enable = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;

    }
}
