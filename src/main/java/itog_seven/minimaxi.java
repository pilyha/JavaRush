package itog_seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minimaxi {
    public static void main(String[] args) throws IOException {

        int[] arr = getInts();;



        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minimum) {
                    minimum = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maximum) {
                    maximum = arr[i];
                }
            }
            System.out.print(maximum + " " + minimum);
        }
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(reader.readLine());
        }
        return arrays;
    }
    }



