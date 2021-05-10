package eight_Collection.SET_or_MAP;
import java.util.*;

public class zarplata {

    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sim", 5000);
        map.put("Tom", 700);
        map.put("Arbus", 650);
        map.put("Baby", 450);
        map.put("Cat", 300);
        map.put("Eat",400);
        map.put("Food", 400);
        map.put("Gevey", 280);
        map.put("Hugs", 1412);
        map.put("Comp", 123);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {

            Map.Entry<String, Integer> pair = iterator.next();

            int s = pair.getValue();
            if (s > 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}


