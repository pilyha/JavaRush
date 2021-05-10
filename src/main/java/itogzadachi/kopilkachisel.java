package itogzadachi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class kopilkachisel {
    public static void main(String[] args) throws Exception {

            int sum = 0;
            int a;

            while (true) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String z = reader.readLine();

                if(z.equals("ex"))
                   break;
                else
                    a = Integer.parseInt(z);
                    sum+=a;
            }
     System.out.println(sum);
        }
    }

