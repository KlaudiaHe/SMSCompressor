import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Paginator {

    public static void main(String[] args) {
        Paginator paginator = new Paginator(10);
        String text = "iuqqqqqqqqqqqqqqqqqqqqqqqqqqqaaaaaaaaaaaaaaaaaaa";
        System.out.println(paginator.paginate(text));
        String text2 = "";
        System.out.println(paginator.paginate(text2));

    }


    private final int LENGTH;

    public Paginator(int length) {
        this.LENGTH = length;
    }


    public Collection<String> paginate(String text) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        //List<String> compressedText = new ArrayList<>();
         Collection<String> result = text.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(c -> atomicInteger.getAndIncrement() / LENGTH
                        , Collectors.joining()))
                .values();
        Collection<String> paginatedText = new ArrayList<>(result);
    return paginatedText;
    }
}
