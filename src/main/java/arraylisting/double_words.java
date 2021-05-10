package arraylisting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class double_words {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();
        for(int i=0;i<2;i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        strings=doubleValues(strings);
        for (int i=0;i<strings.size();i++) {
            System.out.println(strings.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> strings) {
        //напишите тут ваш код

        for (int i = 0; i < strings.size();i=i+2) {

            strings.add(i,strings.get(i));
        }


        return strings;

    }}

