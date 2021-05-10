package eight_Collection;

import java.util.HashSet;
import java.util.Set;
public class set_rasteniy {
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("ирис");
        set.add("картофель");

        for (String text : set)
        {
            System.out.println(text);
        }
    }
}
