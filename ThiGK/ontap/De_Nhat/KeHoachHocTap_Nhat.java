package ontap.De_Nhat;

import java.util.ArrayList;
import java.util.List;

public class KeHoachHocTap_Nhat {
    private SinhVien_Nhat sv;
    private List<MonHoc_Nhat> dsdk;
    private List<MonHoc_Nhat> dsct;

    protected KeHoachHocTap_Nhat(Builder b){
        this.sv = b.sv;
        this.dsct = b.dsct;
        this.dsdk = b.dsdk;
    }

    public String inDS (List<MonHoc_Nhat> ds){
        StringBuilder mh = new StringBuilder();
        for(MonHoc_Nhat i: ds){
            mh.append(i.toString()).append("\n");
        }
        return mh.toString();
    }

    public void removeDK(MonHoc_Nhat mh){
        this.dsdk.removeIf(m -> m.maMH.equals(mh.maMH));
    }

    public void removeCT(MonHoc_Nhat mh){
        this.dsct.removeIf(m -> m.maMH.equals(mh.maMH));
    }

    public void hienThi(){
        System.out.println("KẾ HOẠCH HỌC TẬP");
        System.out.println(sv.toString());
        System.out.println("- Danh sách đăng ký");
        System.out.println(inDS(dsdk));
        System.out.println("- Danh sách cải thiện");
        System.out.println(inDS(dsct));
    }

    public static class Builder{
        private SinhVien_Nhat sv;
        private List<MonHoc_Nhat> dsdk = new ArrayList<>();
        private List<MonHoc_Nhat> dsct = new ArrayList<>();

        public Builder getSinhVien (SinhVien_Nhat sv){
            this.sv = sv;
            return this;
        }

        public Builder addDK(MonHoc_Nhat mh){
            this.dsdk.add(mh);
            return this;
        }

        public Builder addCT(MonHoc_Nhat mh){
            this.dsct.add(mh);
            return this;
        }


        public KeHoachHocTap_Nhat build(){
            return new KeHoachHocTap_Nhat(this);
        }
    }
}
