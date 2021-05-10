package itogzadachi;

public class tomjerry {
    public static void main(String[] args) throws Exception {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog doggy = new Dog("Doggy", 18, 120);
        Cat tom = new Cat("Tom", 15, 'm');
    }

     public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name , int height,int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;


        }
     }
    public static class Dog {
        String name;
        int height;
        int power;

        public Dog(String name , int height,int power)
        {
            this.name = name;
            this.height = height;
            this.power = power;

        }
    }
    public static class Cat {
        String name;
        int height;
        char sex;

        public Cat(String name , int height,char sex)
        {
            this.name = name;
            this.height = height;
            this.sex = sex;

        }
    }


    }

