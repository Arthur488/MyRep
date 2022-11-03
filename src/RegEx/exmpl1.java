package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exmpl1 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Ukraine, Kyiv, Schevchenko street, 20, Flat 13," +
                " email: vivanov@gmail.com, Postcode: AA99, Phone Number: +123456789;"
                + "Petrova Mariya, Ukraine, Chernihiv, Levka street, 10, Flat 56," +
                " email: mariaa@mail.ru, Postcode: CB19, Phone Number: +9876345;"
                +"Maksim Petrov, Ukraine, Vinnitsa, Keletska street, 127, Flat 123," +
                " email: maksim@ukr.net, Postcode: AB45, Phone Number: +567891234;";

        //Pattern word_patter = Pattern.compile("\\w+");\w\+\d+
        //Pattern word_patter = Pattern.compile("\\b\\d{2}\\b|\\b\\d{3}\\b");
        //Pattern word_patter = Pattern.compile("N[A-z]+:\\s(\\+)\\d+");
        Pattern word_patter = Pattern.compile("\\w+[@]\\w+[^\\.]");
        Matcher matcher = word_patter.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
