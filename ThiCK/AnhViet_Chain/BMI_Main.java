package ThiCK.OnTap.AnhViet_Chain;

public class BMI_Main {
    public static void main(String[] args) {
        ChiSoBMI loai5 = new LoaiCaoNhat("Béo phì độ III", 40,Float.MAX_VALUE);
        ChiSoBMI loai4 = new LoaiKhac("Béo phì độ II", 35, 40);
        ChiSoBMI loai3 = new LoaiKhac("Béo phì độ I", 30, 35);
        ChiSoBMI loai2 = new LoaiKhac("Thừa cân", 25, 30);
        ChiSoBMI loai1 = new LoaiKhac("Bình thường", 18.5f, 25);
        ChiSoBMI loai0 = new LoaiKhac("Gầy", 15, 18.5f);

        loai0.
        loaiKeTiep(loai1).
        loaiKeTiep(loai2).
        loaiKeTiep(loai3).
        loaiKeTiep(loai4).
        loaiKeTiep(loai5);

        int chieuCao = 170;
        int canNang = 200;

        float bmi = loai0.tinhBMI(chieuCao, canNang);
        System.out.printf("BMI: %d / (%.2f * %.2f) = %.2f → %s\n",canNang,chieuCao/100.f,chieuCao/100.f, bmi, loai0.xepLoai(bmi));
    }
}
