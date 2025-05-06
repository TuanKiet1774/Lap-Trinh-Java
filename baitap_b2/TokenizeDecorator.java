package bt_java.baitap_b2;

import java.util.List;

public abstract class TokenizeDecorator implements Tokenize{
    Tokenize token;

    public TokenizeDecorator(Tokenize token) {
        this.token = token;
    }

    @Override
    public List<String> tokenize() {
        return List.of();
    }
}

