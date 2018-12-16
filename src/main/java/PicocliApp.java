import Compressor.Compressor;
import Compressor.NaiveCompressor;
import Compressor.OptimalCompressor;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.math.BigDecimal;
import java.util.Collection;

public class PicocliApp {
    @Option(names="-l", description = "Length of the message.")
    int smsLength;

    @Option(names="-p", description = "Unit price of the message.")
    BigDecimal unitPrice;

    @Option(names="-o", description = "Use the optimal compressor. By default application use the naive compressor.")
    boolean useOptimalCompressor;

    @Option(names="-d", description = "Use the decompress mode. By default application use the compress mode.")
    boolean useDecompressionMode;

    @Parameters
    private String text;

    public void run(){

        Paginator paginator = new Paginator(smsLength);
        CostCalculator calculator = new CostCalculator(unitPrice);
        Compressor smsCompressor = useOptimalCompressor ? new OptimalCompressor() : new NaiveCompressor();

        if (useDecompressionMode){
            String decompressedMessage = smsCompressor.smsDecompressor(text);
            System.out.println("Your decoded message: " + decompressedMessage);
        } else {
            String compressedMessage = smsCompressor.smsCompressor(text);
            Collection<String> paginatedMessage = paginator.paginate(compressedMessage);
            System.out.println("Your coded and splited message: " + (paginatedMessage).toString());
            System.out.println("Cost of your message(s): " + calculator.calculateCost(paginatedMessage));
        }
    }
}

//code based on Wojtek's solution: https://github.com/Cato-Old/compressSMS/tree/picocli/src/main/java/Compressor