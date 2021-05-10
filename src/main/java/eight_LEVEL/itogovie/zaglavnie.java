package eight_LEVEL.itogovie;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class zaglavnie {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char [] result = s.toCharArray();

        for(int i=0;i< result.length;i++)
        {

            result[0] = Character.toUpperCase(result[0]);
            if(result[i] == ' ')
                result[i+1] = Character.toUpperCase(result[i+1]);
        }
        System.out.println(result);




        //напишите тут ваш код
    }
}

