
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result;

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
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                        continue; // Restart loop
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error! Invalid operator.");
                    continue; // Restart loop
            }

            System.out.printf("The result is: %.2f%n", result);

            // Ask if the user wants to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = sc.next().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("Exiting Calculator. Thank you!");
                break;
            }
        }

        sc.close();
    }
}
