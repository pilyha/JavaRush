package eight_Collection.itogovie;
import java.util.*;
public class mnozhestvo_zhivotnih {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for(int i=0;i<4;i++)
        {
            Cat cat = new Cat();
            result.add(cat);
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogs = new HashSet<>();
        for(int i=0;i<3;i++)
        {
            Dog dog = new Dog();
            dogs.add(dog);
        }

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> result = new HashSet<>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
       pets.removeAll(cats);



    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for(Object animals : pets)
        {
            System.out.println(animals);

    }
    }

    //напишите тут ваш код
    public static class Dog{
    }
    public static class Cat{
    }
}


