package eight_LEVEL.SET_or_MAP;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class povtori {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Житник", "Влад");
        map.put("Попов", "Илья");
        map.put("Смирнов", "Евгений");
        map.put("Кумпицкая", "Ольга");
        map.put("Баганча", "Валерий");
        map.put("Моргошия", "Эмзар");
        map.put("Мор", "Эм");
        map.put("Морг", "Эмз");
        map.put("Моргош", "Эмза");
        map.put("Маганча", "Валерий");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}