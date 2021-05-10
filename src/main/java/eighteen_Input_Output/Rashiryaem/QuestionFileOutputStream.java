package eighteen_Input_Output.Rashiryaem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream{
    private AmigoOutputStream original;
    public QuestionFileOutputStream(AmigoOutputStream original)
    {
        this.original = original;
    }
    @Override
    public void flush() throws IOException {
        original.flush();
    }

    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {

    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы действительно хотите закрыть поток?Д/Н");
        String s = reader.readLine();
        if(s.equals("Д"))
        {
            original.close();
        }
        else
        {

        }


    }

}
