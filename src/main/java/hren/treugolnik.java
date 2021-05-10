package hren;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class treugolnik {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        int a = Integer.parseInt(z);
        String x = reader.readLine();
        int b = Integer.parseInt(x);
        String s = reader.readLine();
        int c = Integer.parseInt(s);
        if ((a + b) > c && (a + c) > b && (b + c) > a)
            System.out.println("Треугольник существует");
        else
            System.out.println("Треугольник не существует");


    }
}
