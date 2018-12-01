import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class PaginatorTest extends TestCase {

    private Paginator paginator;
    private static int SMS_LENGTH = 10;


    @Before
    public void setUpPaginator(int SMS_LENGTH){
        Paginator paginator = new Paginator();
    }

    @Test
    public void CostCalculatorTest (){
        assertEquals(paginator.paginate("wertyujkmnbgfdsertyujmnbvfcd"),3);
    }




}
