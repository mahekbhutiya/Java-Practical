import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        // Switch-case for operations
        switch(op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                if (b != 0)                // relational operator
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Error! Division by zero");
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}

