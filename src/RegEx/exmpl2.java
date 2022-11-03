package RegEx;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exmpl2 {
    public static void main(String[] args) {

        //String s2 = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz";
        String s2 = "ya@yahoo.com; on@mail.ru; ona@gmail.com; xersobachiy@ukr.net; ";

        //Pattern pattern1 = Pattern.compile("[A-z]");
        Pattern pattern1 = Pattern.compile("@\\w+[^.]");
        Matcher matcher = pattern1.matcher(s2);

        while (matcher.find()){
            System.out.println("position: " + matcher.start() + "   "  + matcher.group());
//            String param1 = matcher.group(1);
//            String param2 = matcher.group(2);
//            String param3 = matcher.group(3);
//            System.out.print(param1 + param2 + param3);
            //System.out.println(matcher.group());


        }


    }
}
