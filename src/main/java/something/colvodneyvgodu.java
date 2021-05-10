package something;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class colvodneyvgodu {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        int a = Integer.parseInt(z);
        if(a % 400 == 0 && a % 100 != 0 || a % 4 ==0)
            System.out.println("Количевство дней в году:366");
        else
            System.out.println("Количевство дней в году:365");
}}
