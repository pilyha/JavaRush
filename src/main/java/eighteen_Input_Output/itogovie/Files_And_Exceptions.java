package eighteen_Input_Output.itogovie;

import java.io.*;

public class Files_And_Exceptions {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = "";
        try {

            while (true) {
                fileName = reader.readLine();
                FileInputStream fileInputStream = new FileInputStream(fileName);

            }
        }catch (FileNotFoundException e)
        {
            System.out.println(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
