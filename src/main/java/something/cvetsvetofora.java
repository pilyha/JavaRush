package something;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cvetsvetofora {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        double t = Double.parseDouble(z);
        if(t % 5 < 3)
            System.out.println("зелёный");
        else if (t % 5 >=3 )
            System.out.println("жёлтый");
        else if (t % 5 >=4)
            System.out.println("красны2й");

    }
}