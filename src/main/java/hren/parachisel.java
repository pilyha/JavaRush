package hren;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class parachisel {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        int a = Integer.parseInt(z);
        String x = reader.readLine();
        int b = Integer.parseInt(x);
        String s = reader.readLine();
        int c = Integer.parseInt(s);
        if (a == b && a != c)
            System.out.println(a + " " + b);
        else if (a == c && b != c)
            System.out.println(a + " " + c);
        else if (b == c && a != b)
            System.out.println(b + " " + c);
        else if (a == b && b == c)
            System.out.println(a + " " + b + " " + c);
    }

}
