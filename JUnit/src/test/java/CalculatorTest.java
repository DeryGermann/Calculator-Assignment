import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private float number1 = 12;
    private float number2 = 14;
    private double number3 = 12;
    private double number4 = 14;

    @Test
    void additionFloat() {
        // Arrange
        Calculator calculator = new Calculator();

        float expectedResult = 26;

        // Act
        float answer = calculator.additionFloat(number1, number2);

        // Assert
        assertEquals(expectedResult, answer);
    }

    @Test
    void additionDouble() {
        // Arrange
        Calculator calculator = new Calculator();

        double expectedResult = 26;

        // Act
        double answer = calculator.additionDouble(number3, number4);

        // Assert
        assertEquals(expectedResult, answer);
    }

    @Test
    void subtractionFloat() {
        // Arrange
        Calculator calculator = new Calculator();

        float expectedResult = -2;

        // Act
        float answer = calculator.subtractionFloat(number1, number2);

        // Assert
        assertEquals(expectedResult, answer);
    }

    @Test
    void subtractionDouble() {
        // Arrange
        Calculator calculator = new Calculator();

        double expectedResult = -2;

        // Act
        double answer = calculator.subtractionDouble(number3, number4);

        // Assert
        assertEquals(expectedResult, answer);
    }

    @Test
    void multiplicationFloat() {
        // Arrange
        Calculator calculator = new Calculator();

        float expectedResult = 168;

        // Act
        float answer = calculator.multiplicationFloat(number1, number2);

        // Assert
        assertEquals(expectedResult, answer);
    }

    @Test
    void multiplicationDouble() {
        // Arrange
        Calculator calculator = new Calculator();

        double expectedResult = 168;

        // Act
        double answer = calculator.multiplicationDouble(number3, number4);

        // Assert
        assertEquals(expectedResult, answer);
    }

    @Test
    void divisionFloat() {
        // Arrange
        Calculator calculator = new Calculator();

        float expectedResult = 12f/14f;

        // Act
        float answer = calculator.divisionFloat(number1, number2);

        // Assert
        assertEquals(expectedResult, answer);
    }

    @Test
    void divisionDouble() {
        // Arrange
        Calculator calculator = new Calculator();

        double expectedResult = 12d/14d;

        // Act
        double answer = calculator.divisionDouble(number3, number4);

        // Assert
        assertEquals(expectedResult, answer);
    }
}