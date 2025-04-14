package behavioral.template.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class MySinhVienDB extends ObjectDB<MySinhVien>{
    @Override
    public int getID(MySinhVien mySinhVien) {
        return mySinhVien.getMaSV();
    }
}
