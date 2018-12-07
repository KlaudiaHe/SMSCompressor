import Compressor.OptimalCompressor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TestOptimalCompressor {

    private OptimalCompressor optimalCompressor;
    private static int SMS_LENGTH = 10;


    @Before
    public void setUpOptimalCompressor(int SMS_LENGTH){
        OptimalCompressor optimalCompressor = new OptimalCompressor();
    }

    @Test
    public void testOptimalCompressor() {
        String message = "Java jest fajna";
        String exitMessage = optimalCompressor.smsCompressor(message);
        assertTrue(exitMessage.length() < message.length());

    }

    @Test
    public void testOptimalDecompressor(){
        String message = "JavaJestFajna";
        String exitMessage = optimalCompressor.smsDecompressor(message);
        assertTrue(exitMessage.length() > message.length());
    }

}