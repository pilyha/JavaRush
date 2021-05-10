package eight_Collection.itogovie;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class min_N {

public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
        }

public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
    int a = Collections.min(array);
       return a;
        }

public static List<Integer> getIntegerList() throws Exception {
        // Создать и заполнить список тут
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int N= Integer.parseInt(reader.readLine());
    List<Integer> list = new ArrayList<Integer>();
    for(int i=0;i<N;i++)
    {
        int b=Integer.parseInt(reader.readLine());
        list.add(b);
    }
        return list;

        }
}

