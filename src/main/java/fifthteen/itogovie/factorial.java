package fifthteen.itogovie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(Factorial(input));
    }
    public static String Factorial(int n){
        String s = null;
        int a = 1;
        if(n<0) {
            s =  "0";
        }
        else if(n==0)
        {
            s = "1";
        }
        else if(n<=150)
        {
            for(int i = 1;i<=n;i++)
            {
                a=a*i;
            }
            s = Integer.toString(a);
        }
        else
            s = "Za gran'u";

        return s;
    }
}
