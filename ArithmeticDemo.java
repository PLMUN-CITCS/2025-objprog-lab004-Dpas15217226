public class ArithmeticDemo{
  public static void main(String[] args) {
    // Given numbers
    int num1 = 10;  // First number
    int num2 = 5;   // Second number

    // Perform arithmetic operations
    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;
    int quotient = num1 / num2;    // Integer division
    int remainder = num1 % num2;   // Remainder

    // An expression, for example, adding the sum and difference
    int expressionResult = sum + difference;

    // Display the results as specified
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
    System.out.println("Remainder: " + remainder);
    System.out.println("Expression Result: " + expressionResult);
  }
}
