package seventeen;

import java.util.ArrayList;
import java.util.List;

public class sad_ogorod {
    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        public void addFruit(int index, String fruit) {
            fruits.add(index,fruit);
        }
        public void removeFruit(int index) {
            fruits.remove(index);
        }
        public void addVegetable(int index, String vegetable) {
            vegetables.add(index,vegetable);
        }
        public void removeVegetable(int index) {
            vegetables.remove(index);
        }




    }
}
