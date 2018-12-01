import org.junit.jupiter.params.*
//rams.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Exercise7_ToUpperCaseTest {
    @ParameterizedTest
    @MethodSource("inputProvider")

    void toUpperCase(String expected, String input) {
        assertEquals(expected, Main.(input));
    }

    private static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of("TEST", "test"),
                Arguments.of("TEST TEST", "test test"),
                Arguments.of("XXX", "xxx"),
                Arguments.of("HELLO?", "hello?")
        );
    }
}