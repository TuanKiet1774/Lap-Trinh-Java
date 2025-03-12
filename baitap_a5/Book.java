package bt_java.baitap_a5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String Tuade;
    private int SoTrang;
    private String TacGia;
    private List<String> Chuongs;

    public Book(Builder b) {
        this.Tuade = b.Tuade;
        this.SoTrang = b.SoTrang;
        this.TacGia = b.TacGia;
        this.Chuongs = b.Chuongs;
    }

    @Override
    public String toString() {
        return "book{" +
                "Tuade='" + Tuade + '\'' +
                ", SoTrang=" + SoTrang +
                ", TacGia='" + TacGia + '\'' +
                ", Chuong=" + Chuongs +
                '}';
    }

    public static class Builder{
        private String Tuade;
        private int SoTrang;
        private String TacGia;
        private List<String> Chuongs = new ArrayList<>(); //Danh sách rỗng

        public Builder buildTuaDe(String TuaDe)
        {
            this.Tuade = TuaDe;
            return this;
        }

        public Builder buildSoTrang(int SoTrang){
            this.SoTrang = SoTrang;
            return this;
        }

        public Builder buildTacGia(String TacGia){
            this.TacGia = TacGia;
            return this;
        }

        public Builder AddChuong(String Chuong){
            this.Chuongs.add(Chuong);
            return this;
        }

        public Book Build(){
            return new Book(this);
        }
    }

}
