package arraylisting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class maxstroka {
    private static ArrayList<String> strings;
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        int max = 0;
        for(int i=0;i<5;i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        for(int i=0;i<strings.size();i++)
        {
            if (strings.get(i).length()>max)
                max = strings.get(i).length();
            }
        for(int i=0;i<strings.size();i++)
        {
            if (strings.get(i).length() == max)
                System.out.println(strings.get(i));
        }
    }
}


