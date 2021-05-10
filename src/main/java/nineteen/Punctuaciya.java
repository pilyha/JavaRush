package nineteen;

import java.io.*;

public class Punctuaciya {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(reader.readLine()));

        String s ="";
        while (fileReader.ready())
        {
            char data = (char) fileReader.read();

            s+=data;
        }
        fileWrite.write(s.replaceAll("\\p{Punct}","").replaceAll("\n",""));
        fileReader.close();
        fileWrite.close();
        reader.close();
    }
}
