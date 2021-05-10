package fourteen.USERLOSER;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
User, Loser, Coder and Proger
*/

public class Solution implements Person {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while(true) {
            key = reader.readLine();

            if (key.equals("user")) {
                person = new User();
            } else if (key.equals("coder")) {
                person = new Coder();
            } else if (key.equals("loser")) {
                person = new Loser();
            } else if (key.equals("proger")) {
                person = new Proger();
            } else {
                reader.close();
                break;
            }

                //создаем объект, пункт 2

                doWork(person); //вызываем doWork

            }

    }

    public static void doWork(Person person) {
        // пункт 3
        if(person instanceof User)
        {
            ((User) person).live();
        }
        else if(person instanceof Person.Loser)
        {
            ((Loser) person).doNothing();
        }
        else if(person instanceof Person.Coder)
        {
            ((Coder) person).writeCode();
        }
        else if(person instanceof Person.Proger)
        {
            ((Proger) person).enjoy();
        }
    }
}
