package Files.Basics;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        String rubai = """
                Много лет размышлял я над жизнью земной.
                Непонятного нет для меня под луной.
                Мне известно, что мне ничего не известно! —
                Вот последняя правда, открытая мной.""";

        String s = "\nPrivet";

        try(FileWriter writer = new FileWriter("C:\\Users\\Arthur Rakhmankulov\\Desktop\\test.txt", true);
            FileReader reader = new FileReader("C:\\Users\\Arthur Rakhmankulov\\Desktop\\test.txt")) {
            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        }


    }
}
