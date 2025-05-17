package bt_java.baitap_a6;

public class DataAccessType1 extends DataAccess {
    private static DataAccessType1 instance;

    public DataAccessType1() {
        super();
    }

    public static DataAccessType1 getInstance(){
        if(instance == null)
            instance = new DataAccessType1();
        return instance;
    }


}
