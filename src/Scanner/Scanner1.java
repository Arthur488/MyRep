package Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input number: ");
//        int number = scanner.nextInt();
//        System.out.println(number);
        Scanner scanner = new Scanner("Hello my friend!\n Kak dela?");

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }


    }
}
