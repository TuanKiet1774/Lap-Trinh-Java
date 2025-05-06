package bt_java.baitap_b2;

import java.util.ArrayList;
import java.util.List;

public class TachTu implements Tokenize{
    private String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokenize() {
        return new ArrayList<>(List.of(s.split(" ")));
    }
}
