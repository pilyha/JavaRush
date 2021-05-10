package fifthteen_Overload.itogovie;

public class poryadok_peremennih {
    static {
        init();
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";



    public poryadok_peremennih() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init(){
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        poryadok_peremennih s = new poryadok_peremennih();
    }
    public static void printAllFields(poryadok_peremennih obj){
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);

    }
}
