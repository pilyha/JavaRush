package eighteen_Input_Output.itogovie;

import java.io.FileInputStream;
import java.io.IOException;

public class Angl_words {
    public static int counter = 0;
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("D:/1.txt");


        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if(data >= 97 && data <= 122||data>=65 && data<=90)
                counter++;
        }
        System.out.println(counter);
        inputStream.close();
    }
}
