
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baket {
    public final static ArrayList<Cat> Products = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        String name = null;
        String price = null;
        int count = 0;


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Введите имя продукта: ");

                 name = reader.readLine();

                if (name == null || name.isEmpty()) {
                    break;
                }
                System.out.println("Введите цену продукта: ");
                price = reader.readLine();
                System.out.println("Введите кол-во продукта: ");
                count = Integer.parseInt(reader.readLine());
                Cat cat = new Cat(name,price,count);
                Products.add(cat);
            }

            printList();
            int summ=0;
        for(int i= 0;i<Products.size();i++) {
            String z = Products.get(i).price;
            String x = z.substring(0,z.length()-1);
            int s=Integer.parseInt(x);
            summ+=s*Products.get(i).count;
        }
        System.out.println("Full price: " + summ);

        }

        public static void printList() {
            for (int i = 0; i < Products.size(); i++) {
                System.out.println(Products.get(i));

            }
        }

        public static class Cat {
            private String name;
            private String price;
            private int count;


            Cat(String name, String price, int count) {
                this.name = name;
                this.price = price;
                this.count = count;
            }

            @Override
            public String toString() {
                return "Product's name: " + name + ", price: " + price + ", count: " + count;

            }
        }
    }
