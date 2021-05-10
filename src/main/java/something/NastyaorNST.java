package something;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NastyaorNST {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        String x = reader.readLine();
        int a = z.length();
        int b = x.length();
        if (z.equals(x)) {
            System.out.println("Имена идентичны");
        }
        else if(a==b)
        {
            System.out.println("Длины имен равны");
        }
        else
        {}

    }
}
