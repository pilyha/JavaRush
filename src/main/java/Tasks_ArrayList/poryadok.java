package Tasks_ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class poryadok {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        for(int i =0;i<strings.size();i++)
        {
            if(strings.get(i).length()>strings.get(i+1).length())
            {
                System.out.println(i+1);
                break;
            }
            else
            {
              continue;
            }

        }


    }
}
