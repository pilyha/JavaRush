package eight_Collection.itogovie;
import java.util.*;

public class sobiraem_semeystvo {
    public static void main(String[] args) {
      //  Human bab1 = new Human("Нина",false,80,);
        //напишите тут ваш код


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        //напишите тут ваш код


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

