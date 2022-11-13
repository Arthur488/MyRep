import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);


//        String fullString = "alliancegaming";
//        String stringToDelete = stringScanner.next();
//        String replace = fullString.replace(stringToDelete, "");
//        System.out.println(replace);
//        String fullString = "algemin";
//        String stringToDelete = "lge";
        String fullString = "alliancegaming";
        String stringToDelete = "gaming";

        char[] charArrayF = new char[fullString.length()];
        char[] charArrayD = new char[fullString.length()];
        for (int i = 0; i < fullString.length(); i++) {
            charArrayF[i] = fullString.charAt(i);
        }
        for (int i = 0; i < stringToDelete.length(); i++) {
            charArrayD[i] = stringToDelete.charAt(i);
        }

        System.out.println("Full Arr: " + Arrays.toString(charArrayF));
        System.out.println("Del Arr: " + Arrays.toString(charArrayD));
        /*
        Full Arr: [g, l, l, g, a, m, i, n]
        Del Arr:  [g, a, m]
         */
        // int j = 0;
        int k = 0;

        char[] array = new char[fullString.length()];
        char[] array2 = new char[fullString.length()];
        int i = 0;

        int counter = 0;
        for (int j = 0; j < charArrayF.length; j++) {

            if(charArrayD[k]==charArrayF[j] && counter == 0){
                counter++;
                for (i = 0; 0 < charArrayF.length-j; i++) {

                        if(charArrayD[i]==charArrayF[j]){
                            array[i] = charArrayF[j];
                            j++;
                        }
                        else {
                            break;
                        }
                }

            }
            if(j<charArrayF.length){
                array2[j] = charArrayF[j];
            }
        }

        for (char el: array) {
            System.out.print("[" + el + "]");
        }
        System.out.println();
        for (char el: array2) {
            System.out.print("[" + el + "]");
        }

        System.out.println();
        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println("ch1: " + ch1 + " | " + "ch2: " + ch2);
        int ascii1 = ch1;
        int ascii2 = ch2;
        System.out.println(ch1 + ": " + ascii1 + " | " + ch2 + ": " + ascii2);
        int resCharASCII = ascii1 + ascii2;
        System.out.println("resCharASCII = " + resCharASCII);
        char resChar = (char)resCharASCII;
        System.out.println("resChar: " + resChar);



    }
}
