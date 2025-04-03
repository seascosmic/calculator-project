import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("DO A CALCULATION!");
        System.out.println("Enter the first number: ");
        double numberOne = user.nextDouble();
        System.out.println("Enter the second number: ");
        double numberTwo= user.nextDouble();
        System.out.println("Choose an operation: (+, -, *, /");
        char operator = user.next().charAt(0);

        if (operator == '+') {
            double result = numberOne + numberTwo;
            System.out.printf("%.1f + %.1f = %.1f", numberOne, numberTwo, result);
        }
        else if (operator == '-') {
            double result = numberOne - numberTwo;
            System.out.printf("%.1f - %.1f = %.1f", numberOne, numberTwo, result);
        }
        else if (operator == '*') {
            double result = numberOne * numberTwo;
            System.out.printf("%.1f * %.1f = %.1f", numberOne, numberTwo, result);
        }
        else {
            double result = numberOne / numberTwo;
            System.out.printf("%.1f / %.1f = %.1f", numberOne, numberTwo, result);
        }

    }
}