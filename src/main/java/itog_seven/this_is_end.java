package itog_seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class this_is_end {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; ; i++) {
            if(strings.get(i).equals("end"))
            {
                break;
            }
            String s = reader.readLine();
            strings.add(s);

        }
        for(int i=0;i<strings.size();i++)
        {
            System.out.println(strings.get(i));
        }

    }
}
