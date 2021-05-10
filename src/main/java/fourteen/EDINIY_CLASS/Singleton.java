package fourteen.EDINIY_CLASS;

public class Singleton {
    static Singleton getInstance() {
      return new Singleton();
    }

   private Singleton(){
    }
}
