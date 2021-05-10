package fifthteen_Overload.itogovie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class parser_request {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

    }
    public static void alert(double value){
        System.out.println("double" + value);
    }

    public static void alert(String value)
    {
        System.out.println("String" + value);
    }
}
