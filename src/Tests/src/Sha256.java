package Tests.src;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Sha256 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        if (string.length() >= 6 && string.length() <= 20) {
            char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
            int pos = 0;
            Random Random = new Random();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i <= 32; i++) {
                int num = Random.nextInt(9 + 1);
                pos = Random.nextInt(chars.length);
                char ch = chars[pos];
                stringBuilder.append(num).append(ch);


            }
            System.out.print(stringBuilder);
        }


    }
}


