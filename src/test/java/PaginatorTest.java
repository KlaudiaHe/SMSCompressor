import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

public class PaginatorTest {

    private Paginator paginator;
    private static int SMS_LENGTH = 3;


    @Before
    public void setUpPaginator(){
        paginator = new Paginator(SMS_LENGTH);
    }

    @Test
    public void testPaginate (){
        String example = "wertyujkr";
        Collection<String> result = paginator.paginate(example);
        ArrayList<String> resultToArray = new ArrayList<>(result);
        assertEquals(paginator.paginate(example).size(), 3);
        assertEquals(resultToArray.get(0), "wer");
        assertEquals(resultToArray.get(1), "tyu");
    }
}

//Iterables.get(collection, 1);
/*ArrayList<Foo> copy = new ArrayList<Foo>(collection);
copy.get(1); */