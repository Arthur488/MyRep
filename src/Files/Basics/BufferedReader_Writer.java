package Files.Basics;

import java.io.*;

public class BufferedReader_Writer {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\x4pla\\Desktop\\test.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\x4pla\\Desktop\\test222.txt")))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.write('\n');
            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
