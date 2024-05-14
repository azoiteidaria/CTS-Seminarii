package Strategy;

public class LowercaseFormatter implements TextFormatter {
    public String format(String text){
        return text.toLowerCase();
    }
}
