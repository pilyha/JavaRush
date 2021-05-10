package eighteen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class frequent_bytes {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int [] arr = new int[256];


        while (inputStream.available() > 0) {
            arr[inputStream.read()]++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
                System.out.println(i+" ");
        }


    }
}
