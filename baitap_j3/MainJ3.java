package bt_java.baitap_j3;

public class MainJ3 {
    public static void main(String[] args){
        SinhVienIT sv1 = new SinhVienIT("Kiet","IT",5,5,5);
        System.out.println("Thong tin sinh vien");

        SinhVienBiz sv2 = new SinhVienBiz("Thuan", "Marketing", 10, 10);

        SinhVienNTU sv3 = new SinhVienNTU("Tri", "Luat") {
            @Override
            public float getDiemTB() {
                return 10;
            }
            //Không cần goi getHocLuc vì từ getDiemTB sẽ trả về học lực tương ứng
            @Override
            public void inThongTin() {
                super.inThongTin();
                System.out.println("Diem trung binh: " + getDiemTB() + " Hoc luc: " + getHocLuc());
                System.out.println();
            }
        };

        sv1.inThongTin();
        sv2.inThongTin();
        sv3.inThongTin();
    }
}
