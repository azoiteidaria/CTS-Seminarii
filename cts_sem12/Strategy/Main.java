package Strategy;

import Strategy.CamelCaseFormatter;
import Strategy.LowercaseFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       TextEditor editor = new TextEditor(new UppercaseFormatter());

       String text = "hello";
       System.out.println("original text: " +text);
       System.out.println("Uppercase: " + editor.formatText(text));

       editor.setFormatter(new LowercaseFormatter());
       System.out.println("Lowercase: "+editor.formatText(text));

       editor.setFormatter(new CamelCaseFormatter());
       System.out.println("Camel case: " + editor.formatText(text));

    }
}