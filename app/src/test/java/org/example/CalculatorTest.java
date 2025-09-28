package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void additionTest() {
        Calculator calculator = new Calculator();
        int result = calculator.addition(3, 5); // <-- positional args
        assertEquals(8, result);
    }
}
