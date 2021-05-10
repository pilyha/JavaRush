package eighteen_Input_Output.itogovie;

import java.io.*;

public class dva_v_odnom {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine(),true);
        FileInputStream fileInputStream1 = new FileInputStream(reader.readLine());
        FileInputStream fileInputStream2 = new FileInputStream(reader.readLine());


        byte[] buffer = new byte[1000];
        while(fileInputStream1.available()>0){
            int count = fileInputStream1.read(buffer);
            fileOutputStream.write(buffer, 0, count);
        }
        while(fileInputStream2.available()>0){
            int count = fileInputStream2.read(buffer);
            fileOutputStream.write(buffer, 0, count);
        }


        fileOutputStream.close();
        fileInputStream1.close();
        fileInputStream2.close();
    }
}
