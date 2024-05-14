package Strategy;

import java.util.Locale;

public class CamelCaseFormatter implements TextFormatter {
    public String format(String text){
        String[] words = text.split("");
        StringBuilder result = new StringBuilder(words[0].toLowerCase());
        for(int i =1; i< words.length; i++){
            result.append(words[i].substring(0,1).toUpperCase()).append(words[i].substring(1).toLowerCase());
        }

        return result.toString();
    }

}
