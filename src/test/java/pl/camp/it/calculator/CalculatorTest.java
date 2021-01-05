package pl.camp.it.calculator;

import org.junit.*;

public class CalculatorTest {

    static Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Konstruktor !!");
    }

    @AfterClass
    public static void usunEfektyUbocznePoKazdymTescie() {
        System.out.println("Usuwanie efektów ubocznych !!");
    }

    @BeforeClass
    public static void przygotowanieDanychPrzedTestem() {
        System.out.println("Wrzucanie usera admin do bazy !!");
    }

    @Test
    public void addTest() {
        int a = 5;
        int b = 10;
        int expectedResult = 15;

        int result = calculator.add(a, b);
        System.out.println(calculator.operations);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void diffTest() {
        int a = 5;
        int b = 3;
        int expectedResult = 2;

        int result = calculator.diff(a, b);
        System.out.println(calculator.operations);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyTest() {
        int a = 5;
        int b = 7;
        int expectedResult = 35;

        int result = calculator.multiply(a, b);
        System.out.println(calculator.operations);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void divideTwoPositivesWithIntegerResultTest() {
        int a = 10;
        int b = 5;
        double expectedResult = 2;

        double result = calculator.divide(a, b);
        System.out.println(calculator.operations);

        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void divideTwoPositivesWithNonIntegerResultTest() {
        int a = 5;
        int b = 2;
        double expectedResult = 2.5;

        double result = calculator.divide(a, b);
        System.out.println(calculator.operations);

        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZero() {
        int a = 5;
        int b = 0;

        calculator.divide(a, b);
        System.out.println(calculator.operations);
    }
}
