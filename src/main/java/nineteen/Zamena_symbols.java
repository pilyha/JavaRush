package nineteen;

import java.io.*;

public class Zamena_symbols {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(reader.readLine()));

        String s ="";
        while (fileReader.ready())
        {
            char data = (char) fileReader.read();
            if(data == '.') {
                data = '!';
            }
            s+=data;
        }
        fileWrite.write(s);
        fileReader.close();
        fileWrite.close();
        reader.close();
    }
}
