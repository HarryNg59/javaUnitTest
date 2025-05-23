import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void sum1() {
        calculator.setA(2);
        calculator.setB(3);
        assertEquals(5, calculator.Sum());
    }

    @Test
    void addition() {
        calculator.setA(1);
        calculator.setB(1);
        assertEquals(3, calculator.Sum());
    }

    @Test
    void multi() {
        calculator.setA(1);
        calculator.setB(1);
        assertEquals(1, calculator.Multi());
    }
}
