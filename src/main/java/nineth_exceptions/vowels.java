package nineth_exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные
*/

public class vowels {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String a = "";
        String b = "";
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                a=a+s.charAt(i)+" ";
            }
            else
             if(s.charAt(i) != ' ') {
                 b = b + s.charAt(i) + " ";
             }
        }
        System.out.println(a);
        System.out.println(b);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
