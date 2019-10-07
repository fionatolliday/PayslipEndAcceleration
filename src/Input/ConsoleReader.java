package Input;

import interfaces.ReaderInterface;

import java.util.Scanner;

public class ConsoleReader implements ReaderInterface {

    @Override
    public String read(String message) {
        Scanner systemInScanner = new Scanner(System.in);
        System.out.println(message);

        return systemInScanner.nextLine();
    }
}
