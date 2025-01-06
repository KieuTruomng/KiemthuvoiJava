import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(7, calculator.add(4, 3), "4 + 3 = 7");
    }

    @Test
    void testSubtract() {
        assertEquals(-6, calculator.subtract(3, 9), "3 - 2 should equal 1");
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 should equal 2.0");
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(6, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
