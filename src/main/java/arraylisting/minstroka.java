package arraylisting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class minstroka {
    private static ArrayList<String> strings;
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        for(int i=0;i<5;i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        int min = strings.get(0).length();
        for(int i=0;i<strings.size()-1;i++) {
            if (strings.get(i).length() < min) {
                min = strings.get(i).length();
            }
        }
        for(int i=0;i<strings.size();i++)
        {
            if(strings.get(i).length() == min)
            System.out.println(strings.get(i));
        }
    }
}


