package eighteen_Input_Output.itogovie;

import java.io.FileInputStream;
import java.io.IOException;

public class Frequency_symbols {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("D:/2.txt");
        int[] ascii = new int[127];
        while (in.available()>0)
            ascii[in.read()]++;
        for (int i = 0; i < ascii.length; i++)
        {
            if (ascii[i] != 0)
                System.out.println((char)i + " " + ascii[i]);
        }
        in.close();

    }
}
