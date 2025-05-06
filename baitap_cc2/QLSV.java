package bt_java.baitap_cc2;

import java.util.List;

public class QLSV {
    ISoSanh<SinhVien> soSanh;
    List<SinhVien> dsSV;

    public QLSV(ISoSanh<SinhVien> soSanh, List<SinhVien> dsSV) {
        this.soSanh = soSanh;
        this.dsSV = dsSV;
    }

    public void sapXep(){
        for (int i = 0; i < dsSV.size() - 1; i++) {
            for (int j = i + 1; j < dsSV.size(); j++){
                if(soSanh.soSanh(dsSV.get(i), dsSV.get(j)) > 0){
                    var temp = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, temp);
                }
            }
        }
    }

    public void inDS(){
        for(SinhVien sv: dsSV){
            System.out.println(sv.getHoTen() + " - " + sv.getDiemTB());
        }
    }
}
