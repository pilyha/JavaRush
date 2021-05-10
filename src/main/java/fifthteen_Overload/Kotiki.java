package fifthteen_Overload;

public class Kotiki {
    public static Cat cat;

    static
    {
        Cat cat = new Cat();
        Kotiki.cat = cat;
        System.out.println(cat.name);
    }
    public static class Cat{
        public String name = "Oleg";
    }
    public static void main(String[] args) {

    }
}
