package seventeen.itogovie.CRUD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван",new Date()));
        allPeople.add(Person.createMale("Петров Петр",new Date()));
    }

    public static void main(String[] args) {

        SimpleDateFormat bdIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat bdOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        try {
            if (args[0].equals("-c")) {
                Person person = null;
                if (args[2].equals("м")) {
                    person = Person.createMale(args[1], bdIn.parse(args[3]));
                } else if (args[2].equals("ж")) {
                    person = Person.createFemale(args[1], bdIn.parse(args[3]));
                }
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            } else if (args[0].equals("-u")) {
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                if (args[3].equals("м")){
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                } else if (args[3].equals("ж")) {
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                }
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(bdIn.parse(args[4]));
            } else if (args[0].equals("-d")) {
                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
            } else if (args[0].equals("-i")) {
                System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() +
                        " " + (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)?"м":"ж") +
                        " " + bdOut.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
            }
        }catch (ParseException e){
            System.out.println(e);
        }



        //start here - начни тут
    }
}