package eighteen_Input_Output.itogovie;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thread_and_Bytes {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";

        List<String> list = new ArrayList<>();

        while (!(fileName = reader.readLine()).equals("exit")) {
            list.add(fileName);
        }

        for (String s : list) {
            ReadThread readThread = new ReadThread(s);
            readThread.start();
            try {
                readThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(resultMap);

        }
    }

    public static class ReadThread extends Thread {
        private final String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(fileName);

                int[] arr = new int[256];


                while (inputStream.available() > 0) {
                    arr[inputStream.read()]++;
                }
                int max = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max)
                        max = arr[i];
                }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == max)
                        resultMap.put(fileName,i);
                }
                inputStream.close();
            }catch (Exception ignored){}
        }
    }
}
