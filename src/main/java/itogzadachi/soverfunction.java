package itogzadachi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class soverfunction {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());


        int minimum = min(a, b);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int min = min(a, b, c);
        int min2 = min(d,e);
        int minimal = min(min,min2);
        return minimal;
    }

    public static int min(int a, int b, int c) {
        int min = 0;
        if (a > b && a < c)
            min = a;
        else if (b < a && b < c)
            min = b;
        else
            min = c;
        return min;
    }

    public static int min(int a, int b) {
        return a<b ? a : b;
    }
}
