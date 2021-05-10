package itog_seven;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class obratniy_massiv {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код

        for(int i = 0;i< array.length;i++){
            for(int j=i;j< array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int tmp = array[j];
                    array[i]= array[j];
                    array[j]=tmp;
                }
            }
                }

}
}
