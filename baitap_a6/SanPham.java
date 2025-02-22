package bt_java.baitap_a6;

public class SanPham {
    private String p_ID;
    private String p_Name;
    private double p_Price;
    private int p_Count;

    public SanPham(String p_ID, String p_Name, double p_Price, int p_Count) {
        this.p_ID = p_ID;
        this.p_Name = p_Name;
        this.p_Price = p_Price;
        this.p_Count = p_Count;
    }

    public String getP_ID() {
        return p_ID;
    }

    public String getP_Name() {
        return p_Name;
    }

    public double getP_Price() {
        return p_Price;
    }

    public int getP_Count() {
        return p_Count;
    }

    public void setP_ID(String p_ID) {
        this.p_ID = p_ID;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public void setP_Price(double p_Price) {
        this.p_Price = p_Price;
    }

    public void setP_Count(int p_Count) {
        this.p_Count = p_Count;
    }
}
