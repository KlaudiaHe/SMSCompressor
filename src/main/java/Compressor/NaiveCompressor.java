package Compressor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NaiveCompressor implements Compressor {
    @Override
    public String smsCompressor(String message) {
        InputStreamReader message = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(message);
        br.lines()
                .map(line -> Stream.of(line.split("\\s+")).map(w -> w.substring(0, 1).toUpperCase() + w.substring(1)).collect(Collectors.joining("")))
                .forEach(System.out::println);
        return null;
    }

    }

    @Override
    public String smsDecompressor(String input) {
        return null;
    }
}
