package fifthteen_Overload.itogovie.file_in_static;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static
    {

        try {
            FileReader fr = new FileReader(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(fr);
            String line;
            while ((line=reader.readLine())!=null) {
                lines.add(line);

            }
            reader.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
