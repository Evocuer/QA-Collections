package Utils;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestAsker {

    private final Scanner scanner;
    private final PrintStream out;

    public TestAsker(InputStream in, PrintStream out) {
        scanner = new Scanner(in).useDelimiter("\n");
        this.out = out;
    }

    public int intAsk(String message) {
        out.println(message);
        return scanner.nextInt();
    }

    public String stringAsk(String message) {
        out.println(message);
        return scanner.next();
    }

    public Double doubleAsk(String message) {
        out.println(message);
        return scanner.nextDouble();
    }

}
