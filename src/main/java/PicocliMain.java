import picocli.CommandLine;

public class PicocliMain {
    public static void main(String[] args) {
        PicocliApp cla = new PicocliApp();
        new CommandLine(cla).parse(args);
        cla.run();
    }
}