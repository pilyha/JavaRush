package nineteen;

import java.io.*;

public class Schet_WORDS {
    public static int counter=0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();
        String s = "";
        while (fileReader.ready()) {
            char data = (char) fileReader.read();
            s += String.valueOf(data);
        }
        String[] strings = s.split("\\W");
        for (String string : strings) {
            if (string.equals("world"))
                counter++;

        }


        System.out.println(counter);
        fileReader.close();
    }
    }

