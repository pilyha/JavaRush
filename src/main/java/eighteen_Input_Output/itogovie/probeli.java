package eighteen_Input_Output.itogovie;

import java.io.*;
import java.text.DecimalFormat;

public class probeli {
    public static int counter_probel = 0;
    public static int counter_symbols = 0;
    public static void main(String[] args) throws IOException {
            FileReader fr = new FileReader("D:/1.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            char arr[] = line.toCharArray();
            for(int i =0;i<arr.length;i++)
            {
                if(arr[i] == ' '){
                    counter_probel++;
                }
            }
        System.out.println(counter_probel+" "+arr.length);
            double sootnoshenie = (double) counter_probel/arr.length*100;
            DecimalFormat f = new DecimalFormat("##.00");
            System.out.println(f.format(sootnoshenie));
            reader.close();
            fr.close();
        }


    }
