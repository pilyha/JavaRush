package sixteen_Concurrency;

import java.util.ArrayList;
import java.util.List;

public class Horse_racing {
    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while(calculateHorsesFinished(horses)!= horses.size()){

        }
    }
    public static int calculateHorsesFinished(List<Horse> horses) {
        int finishedCount = 0;
        for(int i=0;i<horses.size();i++)
        {
            if(!horses.get(i).isFinished())
            {
                System.out.println("Waiting for: " + horses.get(i).getName());
                try {
                    horses.get(i).join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else
            {
                finishedCount++;
            }
        }
        return finishedCount;
    }
    public static List<Horse> prepareHorsesAndStart(int horseCount){
      List<Horse> horses = new ArrayList<>(horseCount);
      String number;
      for(int i =0;i<horseCount+1;i++)
      {
          number=i<10?("0" +i):""+i;
          horses.add(new Horse("Horse_"+number));
      }
        for(int i =0;i<horseCount+1;i++) {
            horses.get(i).start();
        }
            return horses;
    }
    public static class Horse extends Thread{
        private boolean isFinished;

        public Horse(String name){
            super(name);
        }
        public boolean isFinished(){
            return isFinished;
        }

        public void run(){
            String s = "";
            for(int i =0;i<1001;i++)
            {
                s+="" + 1;
                if(i == 1000){
                    s = " has finished the race!";
                    System.out.println(getName()+s);
                    isFinished = true;
                }
            }

        }
    }
}
