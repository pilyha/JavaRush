package eighteen;

import eighteen.Rashiryaem.AmigoOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
