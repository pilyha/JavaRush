package eighteen.itogovie;

import java.io.*;

public class Shifrovka {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        if(args[0].equals("-e")) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();

                outputStream.write(data);
            }
        }
        if(args[0].equals("-d")) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                outputStream.write(data);
            }
        }
        inputStream.close();
        outputStream.close();
    }

}
