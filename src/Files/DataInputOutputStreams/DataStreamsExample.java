package Files.DataInputOutputStreams;

import java.io.*;

public class DataStreamsExample{
    public static void main(String[] args) throws IOException {
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\x4pla\\GIT\\CursProject\\MyRep\\src\\Files\\DataInputOutputStreams\\my_test.bin"));
            DataInputStream inputStream = new DataInputStream(new FileInputStream("C:\\Users\\x4pla\\GIT\\CursProject\\MyRep\\src\\Files\\DataInputOutputStreams\\my_test.bin"))){

            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(5_000_000L);
            outputStream.writeFloat(3.14F);
            outputStream.writeDouble(12345567.89);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

        }
    }
}
