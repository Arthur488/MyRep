package Tests.src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mailFinder {
    public static void main(String[] args) {
        String emails = "ya@yahoo.com; on@mail.ru; ona@gmail.com; xersobachiy@ukr.net; ";

        //Pattern email_pattern = Pattern.compile("\\w+\\.\\w+");
        Pattern email_pattern = Pattern.compile("[^@]\\w+[^\\.]");
        Matcher matcher = email_pattern.matcher(emails);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

        //whatsYourMail(emails);
    }

    /*static void whatsYourMail(String emails){
        for (int j = 0; j < emails.length(); j++) {
            if(emails.charAt(j)==';'){
                System.out.println();
            }
            if(emails.charAt(j)=='@'){
                while (emails.charAt(j+1)!='.'){
                    System.out.print(emails.charAt(j+1));
                    j++;
                }
            }
        }
    }*/
}
