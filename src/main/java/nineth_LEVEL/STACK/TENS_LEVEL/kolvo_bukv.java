package nineth_LEVEL.STACK.TENS_LEVEL;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.*;

/*
Количество букв
*/

public class kolvo_bukv {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        // напишите тут ваш код


        for(int i=0;i<alphabet.size();i++)
        {
            int counter = 0;
            for(int j=0;j< list.size();j++) {
                char[] abc = list.get(j).toCharArray();

                for (int x = 0; x < abc.length; x++)
                    if (alphabet.get(i) == abc[x]) {
                        counter++;
                    }
            }
                System.out.println(alphabet.get(i)+ " " + counter);
        }

    }
}


