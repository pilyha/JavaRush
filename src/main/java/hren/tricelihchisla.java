package hren;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tricelihchisla {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        int a = Integer.parseInt(z);
        String x = reader.readLine();
        int b = Integer.parseInt(x);
        String s = reader.readLine();
        int c = Integer.parseInt(s);
        int counter = 0;
            if (a > 0) {
                counter++;
            }
            if (b > 0) {
                counter++;
            }
            if (c > 0) {
                counter++;
            }

System.out.println(counter);
    }
}
