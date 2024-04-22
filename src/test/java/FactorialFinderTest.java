import org.junit.jupiter.api.Test;

public class FactorialFinderTest {
    @Test
    void shouldBeNullIfNumberIsNegative() {
        FactorialFinder factorialFinder = new FactorialFinder(-5);
        assert factorialFinder.calculator() == null ;
    }

    @Test
    void shouldBeOneIfNumberIsZero() {
        FactorialFinder factorialFinder = new FactorialFinder(0);
        assert factorialFinder.calculator() == 1;
    }

    @Test
    void shouldBeOneIfNumberIsOne() {
        FactorialFinder factorialFinder = new FactorialFinder(1);
        assert factorialFinder.calculator() == 1;
    }

    @Test
    void shouldBeFactorialValueIfNumberIsGreaterThanOne() {
        FactorialFinder factorialFinder = new FactorialFinder(4);
        assert factorialFinder.calculator() == 24 ;
    }
}
