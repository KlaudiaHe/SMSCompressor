package Compressor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NaiveCompressor implements Compressor {

    public static void main(String[] args) {

        System.out.println("Type in your message: ");
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
//FYI, gdy metoda z interfejsu nie jest static:
        NaiveCompressor naiveCompressor = new NaiveCompressor();
        System.out.println(naiveCompressor.smsCompressor(message));

   //     System.out.println(naiveCompressor.smsDecompressor("JavaJestFajna"));

    }


    @Override
    public String smsCompressor(String input) {
        List<String> compressed = new ArrayList<String>(Arrays.asList(input.split(" ")));
        return compressed
                .stream()
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).collect(Collectors.joining(""));
    }


    @Override
    public String smsDecompressor (String input) {
        List<String> decompressed = new ArrayList<String>(Arrays.asList(input.split("(?<=.)(?=\\p{Lu})")));
        return decompressed
                .stream()
                .map(x -> x.substring(0, 1).toLowerCase() + x.substring(1))
                .collect(Collectors.joining(" "));
    }
}
