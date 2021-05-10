package eighteen_Input_Output;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class sorted_deleted_bytes {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        List<Integer> arr = new ArrayList<>();

        while (inputStream.available() > 0)
        {
            arr.add(inputStream.read());
        }
        for(int i=0;i<arr.size()-1;i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                if (arr.get(i).equals(arr.get(j)))
                {
                    arr.remove(j);
                }
            }
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }

        reader.close();
        inputStream.close();
    }
}
