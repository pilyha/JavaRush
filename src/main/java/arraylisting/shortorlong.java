package arraylisting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class shortorlong {
    public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> strings = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                String s = reader.readLine();
                strings.add(s);
            }
            int min = strings.get(0).length();
            int max = strings.get(0).length();
            int maximum = 0;
            int minimum = 0;
           for(int i=0;i<strings.size();i++)
           {
               if (strings.get(i).length() <= min) {
                   min = strings.get(i).length();
                   minimum = i;
               }
           }
            for(int i=0;i<strings.size();i++)
            {
                if (strings.get(i).length() >= max) {
                    max = strings.get(i).length();
                    maximum = i;
                }
            }

                if (minimum<maximum) {
                    System.out.println(strings.get(minimum));
                }
                else
                {
                    System.out.println(strings.get(maximum));
                }

        }
    }
