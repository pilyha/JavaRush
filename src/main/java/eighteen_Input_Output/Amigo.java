package eighteen_Input_Output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Amigo extends FileOutputStream {

    public static String fileName = "C:/tmp/result.txt";

    FileOutputStream component;
    Amigo(FileOutputStream fileOutputStream) throws FileNotFoundException{
        super(fileName);
        this.component = fileOutputStream;
    }

    public static void main(String[] args) throws FileNotFoundException {
      new Amigo(new FileOutputStream(fileName));

    }
}
