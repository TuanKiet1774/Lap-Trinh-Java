package bt_java.baitap_b2;

import java.util.List;

public class LoaiBoTuDung extends TokenizeDecorator{
    public LoaiBoTuDung(Tokenize token) {
        super(token);
    }

    private List<String> tuDungs = List.of("và","hoặc"," thì", "mà","là");

    @Override
    public List<String> tokenize() {
        List<String> t = token.tokenize();
        t.removeAll(tuDungs);
        return t;
    }
}
