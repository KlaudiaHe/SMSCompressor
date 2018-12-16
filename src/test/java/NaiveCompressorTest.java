import Compressor.NaiveCompressor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NaiveCompressorTest {

        private NaiveCompressor naiveCompressor;
        private static int SMS_LENGTH = 10;

        @Before
        public void setUpNaiveCompressor(){
             naiveCompressor = new NaiveCompressor();
        }

        @Test
        public void testNaiveCompressor () {
            String message = "Java jest fajna";
            String exitMessage = "JavaJestFajna";
            assertEquals(naiveCompressor.smsCompressor(message), exitMessage);
        }
            @Test
        public void testNaiveDecompressor (){
                String message1 = "java jest fajna";
                String exitMessage1 = "JavaJestFajna";
                assertEquals(naiveCompressor.smsDecompressor(exitMessage1), message1);

            }
        }

