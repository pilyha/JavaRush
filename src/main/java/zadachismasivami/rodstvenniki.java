package zadachismasivami;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rodstvenniki {
    public static void main(String [] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName,null,null);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName,null,null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null,catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catGrandmother,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catMother,catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catMother,catFather);



        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);


    }
    public static class Cat{
        private String name;
        private Cat firstparent;
        private Cat secondparent;

        Cat(String name) {
            this.name = name;
        }
        Cat(String name,Cat firstparent,Cat secondparent){
            this.name = name;
            this.firstparent = firstparent;
            this.secondparent = secondparent;
        }
@Override
        public String toString(){
            if(firstparent == null && secondparent == null)
                return "The cat's name is " + name + ", no mother " + ", no father ";
            else if(secondparent == null)
                return "The cat's name is" + name + ", mother is " + firstparent.name + ", no father";
            else if(firstparent == null)
                return "The cat's name is" + name + ", no mother "  + ", father is " + secondparent.name;
            else
                return "The cat's name is " + name + ", mother is " + firstparent.name + ", father is " + secondparent.name;
        }

    }

    

}
