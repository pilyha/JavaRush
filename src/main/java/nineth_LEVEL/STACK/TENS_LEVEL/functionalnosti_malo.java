package nineth_LEVEL.STACK.TENS_LEVEL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class functionalnosti_malo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<>();


        while(true)
        {
            int id = Integer.parseInt(reader.readLine());
            String name = reader.readLine();

            if(name.isEmpty())
            {
                break;
            }
            map.put(name,id);
        }
        for(Map.Entry<String,Integer> pair: map.entrySet())
        {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

    }
}


