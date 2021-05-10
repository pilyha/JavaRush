package eighteen_Input_Output;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class zapyatie {
public static int counter = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> bytes = new ArrayList<>();

        while (inputStream.available() > 0)
        {
            if(inputStream.read()==44)
                counter++;
        }

        System.out.println(counter);
    }
}
