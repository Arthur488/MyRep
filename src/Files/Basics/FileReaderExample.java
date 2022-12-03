package Files.Basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\Arthur Rakhmankulov\\Desktop\\test.txt");
            int character;
            while ((character = fileReader.read()) != -1){
                System.out.print((char) character);
            }

        }catch (FileNotFoundException e){
        e.printStackTrace();
        }
        finally {
            fileReader.close();
        }



    }
}

