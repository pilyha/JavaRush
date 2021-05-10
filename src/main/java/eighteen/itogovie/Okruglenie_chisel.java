package eighteen.itogovie;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Okruglenie_chisel {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr1 = new FileReader(reader.readLine());
        FileWriter fw1 = new FileWriter(reader.readLine());
        List<Double> list = new ArrayList<>();
       while (fr1.ready())
       {
           double data = fr1.read();
           list.add(data);
       }
        System.out.println(list);
       fr1.close();
       reader.close();

    }
}
