package RegEx;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exmpl2 {
    public static void main(String[] args) {

        //String s2 = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz";
        String s2 = "ya@yahoo.com; on@mail.ru; ona@gmail.com; xersobachiy@ukr.net; ";

//        char ch;
//        for (int i = 0; i < s2.length(); i++) {
//            ch = s2.charAt(i);
//            if(ch == '@'){
//                while (s2.charAt(i + 1)!='.'){
//                    System.out.print(s2.charAt(i + 1));
//                    i++;
//                }
//                System.out.println();
//
//            }
//        }

        Pattern pattern1 = Pattern.compile("(@)(\\w+)(\\.)");
        Matcher matcher = pattern1.matcher(s2);

        while (matcher.find()){
            System.out.println(matcher.group(2));
        }


    }
}
