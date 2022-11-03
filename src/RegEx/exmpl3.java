package RegEx;

import java.util.Arrays;

public class exmpl3 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Ukraine, Kyiv, Schevchenko street, 20, Flat 13," +
                " email: vivanov@gmail.com, Postcode: AA99, Phone Number: +123456789;"
                + "Petrova Mariya, Ukraine, Chernihiv, Levka street, 10, Flat 56," +
                " email: mariaa@mail.ru, Postcode: CB19, Phone Number: +9876345;"
                +"Maksim Petrov, Ukraine, Vinnitsa, Keletska street, 127, Flat 123," +
                " email: maksim@ukr.net, Postcode: AB45, Phone Number: +567891234;";

        String s2 = "maksim@ukr.net";
        boolean result = s2.matches("\\w+@\\w+\\.\\w+");
        System.out.println(result);

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
