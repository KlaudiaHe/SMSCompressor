import Compressor.NaiveCompressor;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class NaiveCompressorTest extends TestCase {

        private NaiveCompressor naiveCompressor;
        private static int SMS_LENGTH = 10;

        @Before
        public void setUpNaiveCompressor(int SMS_LENGTH){
            NaiveCompressor naiveCompressor = new NaiveCompressor();
        }

        @Test
        public void NaiveCompressTest () {
            String message = "Java jest fajna";
            String exitMessage = "JavaJestFajna";
            assertEquals(naiveCompressor.smsCompressor(message),exitMessage);

            @Test
        public void NaiveDecompressTest(){
                String message1 = "Java jest fajna";
                String exitMessage1 = "JavaJestFajna";
                assertEquals(naiveCompressor.smsDecompressor(exitMessage1), message1);

            }
        }
}
