import java.util.Scanner;

@FunctionalInterface
interface CalculatorInterface {

    double calculate(double a, double b);
}

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice(+,-,/,*)");

        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");

            int choice = sc.nextInt();
            double num1 = 0, num2 = 0;

            if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                System.out.println("Enter first number");
                num1 = sc.nextDouble();
                System.out.println("Enter second number");
                num2 = sc.nextDouble();

            }

            CalculatorInterface objInterface;

            switch (choice) {
                case 1:
                    objInterface = (a, b) -> a + b;
                    System.out.println(objInterface.calculate(num1, num2));
                    break;

                case 2:
                    objInterface = (a, b) -> a - b;
                    System.out.println(objInterface.calculate(num1, num2));
                    break;

                case 3:
                    objInterface = (a, b) -> a / b;

                    if (num2 == 0)
                        throw new ArithmeticException("can not divide by zero");
                    System.out.println(objInterface.calculate(num1, num2));
                    break;

                case 4:
                    objInterface = (a, b) -> a * b;
                    System.out.println(objInterface.calculate(num1, num2));
                    break;

                default:
                    System.out.println("Incorrect choice !!!");
                    break;
            }
        }

    }
}