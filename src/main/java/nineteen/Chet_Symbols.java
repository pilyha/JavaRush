package nineteen;

import java.io.*;

public class Chet_Symbols {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
            int count;
        for (int i = 1; fileReader.ready(); i++) {
            count = fileReader.read();
            if(i%2==0)
            {
                fileWriter.write(count);
            }
        }
        fileReader.close();
        fileWriter.close();

    }
}
