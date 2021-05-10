package eighteen.itogovie;

import java.io.*;

public class obbedinenie_files {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(name1);
        FileInputStream inputStream2 = new FileInputStream(name2);
        byte[] buffer1 = new byte[inputStream1.available()];
        byte[] buffer2 = new byte[inputStream2.available()];
        while (inputStream1.available() > 0) {
            int count = inputStream1.read(buffer1);
        }
        FileOutputStream outputStream1 = new FileOutputStream(name1);

        while (inputStream2.available() > 0) {
            int count2 = inputStream2.read(buffer2);
        }
        inputStream1.close();
        inputStream2.close();
        outputStream1.write(buffer2);
        outputStream1.write(buffer1);
        outputStream1.close();
        reader.close();
    }
}
