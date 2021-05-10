package sixteen.itogovie;

import sixteen.itogovie.Klubok.Solution;

public class Recursion_nitka {
    public static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        public GenerateThread() {
            super(Integer.toString(++createdThreadCount));
            start();

        }

        @Override
        public String toString() {
            return getName() + " created";
        }

        public void run() {
            if (createdThreadCount < count) {
                System.out.println(new GenerateThread());
            }
        }
    }
}
