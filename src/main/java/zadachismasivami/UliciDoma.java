package zadachismasivami;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UliciDoma {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        int chet = 0;
        int nechet = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
            {
                if (i % 2 == 0) {
                    chet += arr[i];
                } else {
                    nechet += arr[i];
                }
            }
        }
        if (nechet < chet) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}
