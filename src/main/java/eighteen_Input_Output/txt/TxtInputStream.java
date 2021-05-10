package eighteen_Input_Output.txt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TxtInputStream extends FileInputStream {
    public TxtInputStream(String fileName) throws FileNotFoundException {
        super(fileName);

    }

    public static void main(String[] args) {

    }
}
