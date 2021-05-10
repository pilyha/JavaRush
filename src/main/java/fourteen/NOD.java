package fourteen;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NOD {
public static void main(String [] args) throws Exception{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    for(int i=(a*b);i>1;i--)
        if(a % i == 0 && b % i == 0 )
        {
            System.out.println(i);
            break;
        }

}
}
