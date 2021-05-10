package seventeen.itogovie.tranzakciya;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String one = reader.readLine();
            String two = reader.readLine();
            BufferedReader br = new BufferedReader(new FileReader(one));
            BufferedReader br1 = new BufferedReader(new FileReader(two));
            while (br.ready()) {
                allLines.add(br.readLine());
            }
            while (br1.ready()) {
                forRemoveLines.add(br1.readLine());
            }

            reader.close();
            br.close();
            br1.close();
            System.out.println(allLines);
            System.out.println(forRemoveLines);
            new Solution().joinData();
            System.out.println(allLines);
            System.out.println(forRemoveLines);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException ie) {
            System.out.println("smth wrong");
        }

    }

    public void joinData() throws CorruptedDataException {
        boolean isAll = false;


        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }
        else{allLines.clear();}

    }
}