import Compressor.OptimalCompressor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class OptimalCompressorTest {

    private OptimalCompressor optimalCompressor;
    private static int SMS_LENGTH = 10;


        @Before
    public void setUpOptimalCompressor(){
        optimalCompressor = new OptimalCompressor();   //a był nullpointer exception, gdyż... 2 razy inicjalizowany był nowy; jako prywatne pole i w setupie
    }

    @Test
    public void testOptimalCompressor() {
        String message = "Java jest fajna";
        String exitMessage = optimalCompressor.smsCompressor(message);
        assertTrue(message.length() >= exitMessage.length());

    }

    @Test
    public void testOptimalDecompressor(){
        String message = "JavaJestFajna";
        String exitMessage = optimalCompressor.smsDecompressor(message);
        assertTrue(exitMessage.length() > message.length());
    }

}