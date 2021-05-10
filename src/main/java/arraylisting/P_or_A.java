package arraylisting;

import java.util.ArrayList;

public class P_or_A {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код

        for (int i = 0; i < strings.size();i++) {
        String s = strings.get(i);
            if (s.contains("р") && !s.contains("л")) {
                strings.remove(s);
                i--;
            }
            else if (!s.contains("р") && s.contains("л")) {
                strings.add(i+1,s);
                i++;
            }
            else if(s.contains("р") && s.contains("л")) {

            }
            else
            {

            }
        }


        return strings;

    }}
