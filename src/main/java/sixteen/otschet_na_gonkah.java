package sixteen;

public class otschet_na_gonkah {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {

            //add your code here - добавь код тут
            while (!isInterrupted()) {
                try {
                    if(numSeconds==0)
                    {
                        System.out.println("Марш");
                        break;
                    }
                    System.out.println(numSeconds);
                    Thread.sleep(1000);
                    numSeconds--;


                } catch (InterruptedException e) {
                    System.out.println("Прервано");
                    break;
                }




            }
        }
    }
}


