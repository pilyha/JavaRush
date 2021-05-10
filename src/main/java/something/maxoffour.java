package something;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class maxoffour {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        int a = Integer.parseInt(z);
        String x = reader.readLine();
        int b = Integer.parseInt(x);
        String s = reader.readLine();
        int c = Integer.parseInt(s);
      if(a>=b && b>=c)
          System.out.println(a + " " + b + " " + c);
       else if(a>=c && b>=a)
            System.out.println(b + " " + a + " " + c);
       else if(c>=b && b>=a)
            System.out.println(c + " " + b + " " + a);
       else if(c>=b && b>=a)
            System.out.println(a + " " + c + " " + b);
        else if(b>=c && c>=a)
            System.out.println(b + " " + c + " " + a);
        else if(c>=a && a>=b)
            System.out.println(c + " " + a + " " + b);

    }
}
