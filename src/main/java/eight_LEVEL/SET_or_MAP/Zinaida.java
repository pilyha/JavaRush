package eight_LEVEL.SET_or_MAP;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;





public class Zinaida {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Попов", dateFormat.parse("MAY 2 2012"));
        map.put("Олегов", dateFormat.parse("MAY 3 2012"));
        map.put("Жекич", dateFormat.parse("MAY 4 2012"));
        map.put("Жека", dateFormat.parse("JULE 5 2012"));
        map.put("Житник", dateFormat.parse("MAY 6 2012"));
        map.put("Житков", dateFormat.parse("MAY 7 2012"));
        map.put("Житников", dateFormat.parse("MAY 8 2012"));
        map.put("Попня", dateFormat.parse("JUNE 9 2012"));
        map.put("Поповник", dateFormat.parse("MAY 10 2012"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Calendar cal = Calendar.getInstance();
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            cal.setTime(iterator.next().getValue());
            if (cal.get(Calendar.MONTH) >= 5 && cal.get(Calendar.MONTH) <= 7){
                iterator.remove();



            }

        }
    }
    public static void main(String[] args) {


    }
}


