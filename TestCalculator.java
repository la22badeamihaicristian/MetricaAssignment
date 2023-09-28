

public class TestCalculator {
    public static void main(String[] args) {
        testcalculate();
    }

    public static void testcalculate() {
        String expression = "2*3";
        String expectedResult = "7.0";
        Calculator.Run(expression);
        String textResult = Float.toString(Calculator.finalResult);

        if (expectedResult.equals(textResult)) {
            System.out.println ("Test passed");
        
        } else {
            System.out.println ("Test failed.");
        }
    }
}