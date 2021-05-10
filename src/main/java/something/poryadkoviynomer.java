package something;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class poryadkoviynomer {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        int a = Integer.parseInt(z);
        String x = reader.readLine();
        int b = Integer.parseInt(x);
        String s = reader.readLine();
        int c = Integer.parseInt(s);
       if(a!=b && a!=c && b==c)
           System.out.println(1);
       else if (b!=a && b!=c && a==c)
           System.out.println(2);
       else if (c!=a && c!=b && a==b)
        System.out.println(3);
       else if(a!=b && b!=c && a!=c) {


       }
    }
}
