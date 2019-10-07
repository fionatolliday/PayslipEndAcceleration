package Output;

import interfaces.WriterInterface;

public class ConsoleWriter implements WriterInterface {


    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
