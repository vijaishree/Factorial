import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialFinderTest {
    @Test
    void factorialValueToBeNullIfNumberIsNegative() {
        Throwable exception = assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                FactorialFinder factorialFinder = new FactorialFinder();
                factorialFinder.find(-5);
            }
        });

        assertEquals("Number is less than zero", exception.getMessage());

    }

    @Test
    void factorialValueToBeOneIfNumberIsZero() {
        FactorialFinder factorialFinder = new FactorialFinder();
        assert factorialFinder.find(0) == 1;
    }

    @Test
    void factorialValueToBeOneIfNumberIsOne() {
        FactorialFinder factorialFinder = new FactorialFinder();
        assert factorialFinder.find(1) == 1;
    }

    @Test
    void factorialValueToBeTwentyFourIfNumberIsFour() {
        FactorialFinder factorialFinder = new FactorialFinder();
        assert factorialFinder.find(4) == 24 ;
    }
}
