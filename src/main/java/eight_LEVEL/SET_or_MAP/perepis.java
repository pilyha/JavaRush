package eight_LEVEL.SET_or_MAP;

import java.util.HashMap;
import java.util.Map;

public class perepis {
    public static Map<String,String> createMap()
    {
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
    public static  int getCountTheSameFirstName(Map<String,String> map,String name)
    {
        int count = 0;
        for(Map.Entry<String,String> pair : map.entrySet())
        {
            String s= pair.getValue();
            if(s.equals(name))
            {
                count++;
            }
        }
        return count;
    }
    public static  int getCountTheSameSecondName(Map<String,String> map,String lastname)
    {
        int countL = 0;
        for(Map.Entry<String,String> pair : map.entrySet())
        {
            String s= pair.getKey();
            if(s.equals(lastname))
            {
                countL++;
            }

        }
        return countL;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(map);
        System.out.println(getCountTheSameFirstName(map,"Валерий"));




    }
}
