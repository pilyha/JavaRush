package eighteen_Input_Output;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class max_byte {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int max = Integer.MIN_VALUE;

        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            if(data>max)
            {
                max = data;
            }
        }
        inputStream.close();
        reader.close();
        System.out.println(max);
    }
}
