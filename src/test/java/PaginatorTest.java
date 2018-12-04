import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static java.lang.reflect.Array.get;

public class PaginatorTest extends TestCase {

    private Paginator paginator;
    private static int SMS_LENGTH = 3;


    @Before
    public void setUpPaginator(int SMS_LENGTH){
        Paginator paginator = new Paginator(SMS_LENGTH);
    }

    @Test
    public void paginate (){
        String example = "wertyujkr";
        Collection<String> result = paginator.paginate(example);
        assertEquals(paginator.paginate(example).size(), 3);
        assertEquals(get(result.iterator(),0), "Wer");
    }
}
