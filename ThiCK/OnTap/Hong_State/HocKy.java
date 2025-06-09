package ThiCK.OnTap.Hong_State;

import java.util.ArrayList;
import java.util.List;

public class HocKy {
    public List<MonHoc> dsmh = new ArrayList<>();
    public ITrangThai state;



    public void addMonHoc(MonHoc mh){
        dsmh.add(mh);
    }

    public void getTrangThai(){
        double sumDiem = 0;
        double sumTC = 0;

        for(var i: dsmh){
            sumTC += i.soTC;
            sumDiem+=i.diem * i.soTC;
        }

        double diemTB = sumDiem / sumTC;
        if(diemTB >= 7){
            state = new TrangThaiBinhThuong();
        } else if (diemTB >= 5) {
            state = new TrangThaiCanhBao();
        }
        else{
            state = new TrangThaiBuocThoiHoc();
        }
    }

    public void display(){
        System.out.println("Danh sách môn học:");
        for(var i: dsmh){
            System.out.println("+ " + i.tenMon + ": " + i.soTC );
        }
        state.display();
    }
}
