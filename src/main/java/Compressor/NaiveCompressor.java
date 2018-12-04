package Compressor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NaiveCompressor implements Compressor {
    @Override
    public String smsCompressor(String input) {
        List<String> compressed = new ArrayList<String>(Arrays.asList(input.split(" ")));
        return compressed
                .stream()
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).collect(Collectors.joining(""));
    }


    @Override
    public String smsDecompressor(String input) {
        List<String> compressed = new ArrayList<String>(Arrays.asList(input.split("(?<=.)(?=\\p{Lu})")));
        return compressed
                .stream()
                .map(x -> x.substring(0, 1).toLowerCase() + x.substring(1))
                .collect(Collectors.joining(" "));
    } //ALE co z pierwszymi literami zdań. Albo... no? no nie wiem.
}
