import Compressor.Compressor;
import Compressor.NaiveCompressor;
import Compressor.OptimalCompressor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        int SMS_LENGTH= 160;
        BigDecimal SMS_PRICE = BigDecimal.valueOf(0.3);

        System.out.println("Type in your message: ");
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        System.out.println("Choose a type of compression (n = naive; o = optimal): ");
        String compressorType = input.nextLine();
        Paginator paginator = new Paginator(SMS_LENGTH);
        CostCalculator calculator = new CostCalculator(SMS_PRICE);
        Compressor compressor;

        switch (compressorType){
            case "n": compressor = new NaiveCompressor();
                break;
            case "o": compressor = new OptimalCompressor();
                break;
            default: throw new IllegalArgumentException();
        }

        String compressed = compressor.smsCompressor(message);
        List<String> paginated = paginator.paginate(compressed);
        System.out.println(paginated);
        System.out.println("Cost of your message(s): " + calculator.calculateCost(paginated));
        String decompressedAgain = compressor.smsDecompressor(compressed);
        System.out.println("Here's your message decompressed again: "+decompressedAgain);

    }


}