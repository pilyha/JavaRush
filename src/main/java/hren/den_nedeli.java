package hren;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class den_nedeli {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        int a = Integer.parseInt(z);
        if (a == 1)
        System.out.println("понедельник");
        else if (a == 2)
            System.out.println("вторник");
        else if (a == 3)
            System.out.println("среда");
        else if (a == 4)
            System.out.println("четверг");
        else if (a == 5)
            System.out.println("пятница");
        else if (a == 6)
            System.out.println("суббота");
        else if (a == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");

    }
}
