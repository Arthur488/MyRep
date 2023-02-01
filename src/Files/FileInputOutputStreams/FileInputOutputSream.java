package Files.FileInputOutputStreams;

import java.io.*;

public class FileInputOutputSream {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\x4pla\\Desktop\\image.webp");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\x4pla\\Desktop\\image2.webp"))
        {

            int i;
            while ((i=fileInputStream.read())!=-1){
                fileOutputStream.write(i);
            }
            System.out.println("Done!");


        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
