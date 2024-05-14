package Strategy;

import Strategy.TextFormatter;

public class UppercaseFormatter implements TextFormatter {
    public String format(String text){
        return text.toUpperCase();
    }
}
