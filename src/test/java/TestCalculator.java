import org.example.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    @org.junit.jupiter.api.Test
    void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result, "2+3=5");
    }

}
