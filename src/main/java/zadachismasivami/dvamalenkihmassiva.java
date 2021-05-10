package zadachismasivami;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class dvamalenkihmassiva {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[20];
        int [] arrr = new int[10];
        int [] arrrr = new int[10];
        for (int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        for(int i=0;i<arrr.length;i++) {
            arrr[i] = arr[i];
        }
       int k=10;
       for(int i=0;i<arrrr.length;i++,k++)
       {
           arrrr[i] = arr[k];
       }
        for(int i=0;i<arrr.length;i++){
            System.out.println(arrrr[i]);
        }
}
}
