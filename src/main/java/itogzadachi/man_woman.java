package itogzadachi;

public class man_woman {
    public static void main(String[] args) throws Exception {
    Man man1 = new Man("Oleg",12,"Perova");
    Man man2 = new Man("Zhenya",32,"Olhova");
    Woman woman1 = new Woman("Olga",19,"Avenue");
    Woman woman2 = new Woman("Ann",19,"Svobodi");
    System.out.println(man1);
    System.out.println(man2);
    System.out.println(woman1);
    System.out.println(woman2);


    }
    public static class Man{
        String name;
         int age;
         String address;
        public Man(String name,int age,String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }

    }
    public static class Woman{
         String name;
         int age;
         String address;
        public Woman(String name,int age,String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}
