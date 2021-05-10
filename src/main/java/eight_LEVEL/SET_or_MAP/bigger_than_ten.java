package eight_LEVEL.SET_or_MAP;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class bigger_than_ten {
    public static Set<Integer> createSet(){
    Set<Integer> set = new HashSet<>();
    for(int i=0;i<20;i++){
     set.add(i);
    }
    return set;
    }
    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            Integer x = setIterator.next();
            if (x > 10)
                setIterator.remove();
        }
        return set;
    }
    public static void main(String[] args){
        Set<Integer> set = createSet();
        Set<Integer> sett = removeAllNumbersGreaterThan10(set);
    }

}
