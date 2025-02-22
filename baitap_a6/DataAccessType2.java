package bt_java.baitap_a6;

public class DataAccessType2 extends DataAccess {
    private static DataAccessType2 instance;

    public DataAccessType2() {
        super();
    }

    public static DataAccessType2 getInstance(){
        if(instance == null)
            instance = new DataAccessType2();
        return instance;
    }
}
