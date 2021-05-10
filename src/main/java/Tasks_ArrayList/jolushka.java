package Tasks_ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class jolushka {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> strings = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> dop = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            strings.add(Integer.parseInt(s));
            if(strings.get(i)%3==0 && strings.get(i)%2==0)
            {
                three.add(strings.get(i));
                two.add(strings.get(i));
            }
            else if(strings.get(i)%3==0)
            {
            three.add(strings.get(i));
            }
            else if(strings.get(i)%2==0)
            {
                two.add(strings.get(i));
            }
            else
            {
                dop.add(strings.get(i));
            }

        }
        printList(three);
        printList(two);
        printList(dop);
    }
    public static void printList(ArrayList<Integer> strings){
     for(int i =0;i<strings.size();i++)
         System.out.println(strings.get(i));
    }
}
