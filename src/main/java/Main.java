import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        PicocliApp picocliApp = new PicocliApp();
        new CommandLine(picocliApp).parse(args);
        picocliApp.run();
    }
}