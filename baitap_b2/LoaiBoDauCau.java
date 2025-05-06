package bt_java.baitap_b2;

import java.util.List;

public class LoaiBoDauCau extends TokenizeDecorator{
    public LoaiBoDauCau(Tokenize token) {
        super(token);
    }

    @Override
    public List<String> tokenize() {
        List<String> t = token.tokenize();
        t.replaceAll(s -> s.replaceAll("\\p{Punct}", ""));
        return t;
    }
}
