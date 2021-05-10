package eight_LEVEL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class max_sequence {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> strings = new ArrayList<> ();
        for (int i = 0; i < 6; i++) {
            strings.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int max = 1;
        for (int i=0; i<strings.size()-1;i++)
        {
            if (strings.get(i) == strings.get(i + 1))
            {
                count++;
                if (max < count)
                    max = count;
            }
            else
                count=1;
        }
        System.out.println(max);
    }
}
