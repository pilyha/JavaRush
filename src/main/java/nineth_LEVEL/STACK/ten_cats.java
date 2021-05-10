package nineth_LEVEL.STACK;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Десять котов
*/

public class ten_cats {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String,Cat> map = new HashMap<>();
        map.put("А",new Cat("1"));
        map.put("Б",new Cat("2"));
        map.put("В",new Cat("3"));
        map.put("Г",new Cat("4"));
        map.put("Д",new Cat("5"));
        map.put("Е",new Cat("6"));
        map.put("Ё",new Cat("7"));
        map.put("Ж",new Cat("8"));
        map.put("З",new Cat("9"));
        map.put("И",new Cat("10"));
     return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>(map.values());
        return set;

    }


    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
