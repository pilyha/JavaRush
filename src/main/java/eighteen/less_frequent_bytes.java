package eighteen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class less_frequent_bytes {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int[] arr = new int[256];


        while (inputStream.available() > 0) {
            arr[inputStream.read()]++;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        inputStream.close();

    }
}

