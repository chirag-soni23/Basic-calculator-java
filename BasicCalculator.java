import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input first number
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            // select operator
            System.out.print("Enter an operator (+,-,*,/): ");
            char operator = scanner.next().charAt(0);

            // Input second number
            System.out.print("Enter second number: ");
            double num2 = scanner.nextInt();

            // result
            double result = 0;

            // switch case
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.print("Error! Division by zero.");
                        return;
                    }
                    break;

                default:
                    System.out.print("Invalid Operator!");
                    break;
            }
            System.out.println("The result is " + result);
        }
    }
}