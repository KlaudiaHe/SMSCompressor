import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        PicocliApp cla = new PicocliApp();
        new CommandLine(cla).parse(args);
        cla.run();
    }
}