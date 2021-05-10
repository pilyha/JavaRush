package nineteen;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class AdapterIO {
    public static class AdapterFileOutputStream implements AmigoStringWriter {
        public static void main(String[] args) {

        }
        private FileOutputStream fileOutputStream;

        public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
            this.fileOutputStream = fileOutputStream;
        }

        @Override
        public void flush() throws IOException {
            fileOutputStream.flush();
        }

        @Override
        public void writeString(String s) throws IOException {
            fileOutputStream.write(s.getBytes(StandardCharsets.UTF_8));
        }

        @Override
        public void close() throws IOException {
            fileOutputStream.close();
        }
    }
    public interface AmigoStringWriter{
        void flush() throws IOException;
        void writeString(String s) throws IOException;
        void close () throws IOException;
}
}
