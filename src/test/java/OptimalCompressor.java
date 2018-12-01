import Compressor.OptimalCompressor;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class OptimalCompressorTest extends TestCase {

    private OptimalCompressor optimalCompressor;
    private static int SMS_LENGTH = 10;


    @Before
    public void setUpOptimalCompressor(int SMS_LENGTH){
        OptimalCompressor optimalCompressor = new OptimalCompressor();
    }

    @Test
    public void OptimalCompressTest () {
        String message = "Java jest fajna";
        String exitMessage = optimalCompressor.smsCompressor(message);
        assertTrue(exitMessage.length() < message.length());

    }

    @Test
    public void OptimalDecompressTest(){
        String message = "JavaJestFajna";
        String exitMessage = optimalCompressor.smsDecompressor(message);
        assertTrue(exitMessage.length() > message.length());
    }


}