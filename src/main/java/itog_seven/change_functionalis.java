package itog_seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class change_functionalis {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            if(string.length() % 2 == 0)
                resultStrings.add(string + " " + string);

            else if(string.length() % 2 != 0)
                resultStrings.add(string + " " + string + " " + string);
        }

        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
    }
}


