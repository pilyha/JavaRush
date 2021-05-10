package something;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sravneniechisel {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        int a = Integer.parseInt(z);
        String y = reader.readLine();
        int b = Integer.parseInt(y);
        if(a<b)
            System.out.println(a);
        else if (b<a)
            System.out.println(b);
        else if(a==b)
            System.out.println(a);

    }
}
