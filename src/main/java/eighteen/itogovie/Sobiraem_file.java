package eighteen.itogovie;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Sobiraem_file {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer,String> map_files = new TreeMap<>();
        String fileName;

        while (!(fileName = reader.readLine()).equals("end")) {
            if ((fileName.contains(".part"))){
                map_files.put(Integer.parseInt(fileName.substring(fileName.lastIndexOf("part") + 4)),fileName);
            }
        }
        String polniy_file = map_files.get(map_files.firstKey());
        String file1 = polniy_file.substring(0,polniy_file.lastIndexOf(".part"));

        FileOutputStream fileOutputStream =new FileOutputStream(file1,true);
        for(Map.Entry<Integer, String> pair : map_files.entrySet())
        {
            FileInputStream fileInputStream = new FileInputStream(pair.getValue());
            byte[] buffer = new byte[fileInputStream.available()];
            while (fileInputStream.available()>0)
            {
                fileInputStream.read(buffer);
                fileOutputStream.write(buffer);
            }
            fileInputStream.close();
        }
        fileOutputStream.close();
        reader.close();

    }
}
