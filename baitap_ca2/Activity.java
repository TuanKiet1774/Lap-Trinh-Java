package bt_java.baitap_ca2;


public class Activity implements IClickListener {
    public  int clickCount = 0;
    public  String acName;

    public Activity(String acName) {
        this.acName = acName;
    }

    public String getAcName() {
        return acName;
    }

    @Override
    public void onClick() {
        clickCount++;
        System.out.println("[" + acName + "] thong bao: bạn đã click lần thứ " + clickCount);
    }

    public int getClickCount() {
        return clickCount;
    }
}
