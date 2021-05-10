package arraylisting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class obratnie_slova {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        strings.remove(2);
        for(int i = strings.size()-1;i>=0;i--){
            System.out.println(strings.get(i));
        }

    }
}
