package eighteen_Input_Output;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverse_files {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f1 = new FileInputStream(reader.readLine());
        FileOutputStream f2 = new FileOutputStream(reader.readLine());
        List<Integer> arr = new ArrayList<>();
        while (f1.available() > 0)
        {
            arr.add(f1.read());
        }
        Collections.reverse(arr);
        for(int i=0;i<arr.size();i++)
        {
            f2.write(arr.get(i));
        }

    }
}
