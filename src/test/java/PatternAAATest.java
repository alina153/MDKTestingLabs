import PatternAAA.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatternAAATest {

    public PatternAAATest() {
    }

    @Test
    public void calculate_sum_test() {
        Calculator calculator = new Calculator();
        double first = 10.0D;
        double second = 20.0D;
        double result = calculator.calculateSum(first, second);
        Assertions.assertEquals(30.0D, result);
    }
}

