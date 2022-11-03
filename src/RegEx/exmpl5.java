package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exmpl5 {
    public static void main(String[] args) {
        String myString = "12324235446655771212121;" + "45712171234665121224235;" + "57742354212112346654235;";
        //66/54 5774 2354 2121 1234 235
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(myNewString);

        while (matcher.find()){
            System.out.println(matcher.group(7));
        }
    }
}
