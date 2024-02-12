import javAngry.powerOfTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class powerOfTwoTest {

    /**
     * Написать код, который принимает число и выдает true,
     * если число является степенью двойки и false - если нет
     * 2, 256, 300, 500, 1024
     * true, true, false, false, true
     */

    private static Stream<Arguments> powerOfTwoProvider() {
        return Stream.of(
                Arguments.of(2, true),
                Arguments.of(256, true),
                Arguments.of(300, false),
                Arguments.of(500, false),
                Arguments.of(1024, true)
        );
    }

    @ParameterizedTest
    @MethodSource("powerOfTwoProvider")
    public void testTomanToInt(int num, boolean expectedResult) {
        boolean actualResult = powerOfTwo.powerOfTwo(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
