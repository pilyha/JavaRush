package eighteen_Input_Output;

import java.io.*;

public class razdel_files {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f1 = new FileInputStream(reader.readLine());
        FileOutputStream f2 = new FileOutputStream(reader.readLine());
        FileOutputStream f3 = new FileOutputStream(reader.readLine());
        int flag = f1.available()/2;
        while (f1.available()>0)
        {
            if(f1.available()>flag)
            {
                byte data = (byte) f1.read();
                f3.write(data);
                
            }
            else {
                byte data = (byte) f1.read();
                f2.write(data);
            }

        }

    }
}
