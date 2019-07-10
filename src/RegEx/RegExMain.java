package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMain {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("1 + 2 ");

        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
