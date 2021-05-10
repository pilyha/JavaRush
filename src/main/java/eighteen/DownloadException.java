package eighteen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DownloadException {
    public static void main(String[] args) throws IOException, Download_Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            try (FileInputStream fip = new FileInputStream(reader.readLine())){
                if(fip.available()<1000)
                    throw new Download_Exception();
            }
        }
    }
    public static class Download_Exception extends Exception{

    }
}
