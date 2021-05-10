package Tasks_ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class nachalospiska {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(0,s);
                    }
        for(int i=0;i<13;i++)
        {
            String s = strings.remove(4);
            strings.add(0,s);
        }
        for(int i=0;i<strings.size();i++)
        {
            System.out.println(strings.get(i));
        }
    }
}
