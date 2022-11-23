package Tests.src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TEst3 {
    public static void main(String[] args) {
        String s1 = "Bob ArthurA Arthur Nikita Andrew Vitya";

        Pattern pattern = Pattern.compile("A\\w+\\s");
        Matcher matcher = pattern.matcher(s1);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
