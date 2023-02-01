package Files.Basics;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String rubai = """
                Много лет размышлял я над жизнью земной.
                Непонятного нет для меня под луной.
                Мне известно, что мне ничего не известно! —
                Вот последняя правда, открытая мной.""";

        String s = "\nPrivet";

        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\x4pla\\Desktop\\test.txt", true);

            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            writer.close();
        }

    }
}
