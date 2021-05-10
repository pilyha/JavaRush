package nineteen;

import java.io.*;
import java.security.Signature;
import java.util.ArrayList;

public class Videlyaem_chisla {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
        ArrayList<Integer> numbers = new ArrayList<>();

        String s = "";
        while (fileReader.ready()) {
            char data = (char) fileReader.read();
            s += String.valueOf(data);
        }
        fileReader.close();

        String [] chisla = s.split(" ");

        for (String string:chisla) {
            try {
                Integer.parseInt(string);
                fileWriter.write(string+" ");
            } catch (Exception ignore){
        }
        }

        fileWriter.close();
        reader.close();

    }
}
