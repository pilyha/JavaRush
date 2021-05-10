package itog_seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class perestanovocha {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        String s = reader.readLine();
        int N = Integer.parseInt(s);
        String z = reader.readLine();
        int M = Integer.parseInt(z);

        for (int i = 0; i < N; i++) {
            strings.add(reader.readLine());
        }
        for(int i=0;i<M;i++)
        {
            strings.add(strings.get(0));
            strings.remove(strings.get(0));


            //strings.add(strings.get(i+1));
        }
        for(int i =0;i< strings.size();i++)
        {
            System.out.println(strings.get(i));
        }


    }
}
