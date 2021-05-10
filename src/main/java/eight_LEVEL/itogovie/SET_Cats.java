package eight_LEVEL.itogovie;
import java.util.Set;
import java.util.HashSet;

public class SET_Cats {
        public static void main(String[] args) {
        Set<Cat> cats = createCats();

        cats.remove(new Cat());

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<>();
        for(int i=0;i<3;i++)
        {
            Cat cat = new Cat();
            cats.add(cat);
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat text : cats)
        {
            System.out.println(text);
        }
    }

    // step 1 - пункт 1
    public static class Cat{

    }
}

