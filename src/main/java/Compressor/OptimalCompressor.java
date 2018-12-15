package Compressor;

import JSmaz.JSmaz;

import java.nio.charset.StandardCharsets;

public class OptimalCompressor implements Compressor {

        JSmaz jsmaz = new JSmaz();

    @Override
    public String smsCompressor(String input) {
        return new String(jsmaz.compress(input), StandardCharsets.ISO_8859_1);
    }

    @Override
    public String smsDecompressor(String input) {
            return jsmaz.decompress(input.getBytes(StandardCharsets.ISO_8859_1));
        }

    }