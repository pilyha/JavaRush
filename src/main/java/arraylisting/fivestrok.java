package arraylisting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class fivestrok {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<String>();
        String s = "Andrey";
        for(int i=0;i<5;i++) {
            arr.add(s);
        }
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++) {
            System.out.println(arr.get(i));
        }
    }
}
