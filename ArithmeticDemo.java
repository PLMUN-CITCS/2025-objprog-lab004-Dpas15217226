// Define the class ArithmeticDemo
public class ArithmeticDemo {
    public static void main(String[] args) {
        // Declare and initialize integer variables
        int num1 = 10;
        int num2 = 5;

        // Declare and initialize a double variable
        double num3 = 3.0;

        // Perform addition
        int sum = num1 + num2;

        // Perform subtraction
        int difference = num1 - num2;

        // Perform multiplication
        int product = num1 * num2;

        // Perform integer division
        int quotient = num1 / num2; // Integer division truncates the decimal part

        // Perform modulus operation
        int remainder = num1 % num2;

        // Demonstrate operator precedence
        // Expression: num1 + num2 * 2 - (num1 / num2)
        // Step 1: Parentheses first -> (10 / 5) = 2
        // Step 2: Multiplication -> 5 * 2 = 10
        // Step 3: Addition and subtraction from left to right -> 10 + 10 - 2 = 18
        int expressionResult = num1 + num2 * 2 - (num1 / num2);

        // Output the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult); // Explains order of operations
    }
}
