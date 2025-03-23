import java.util.Scanner;

public class Main {  // Change class name to Main
    static int computedValue;

    public static int getMaxOfTwo(int first, int second) {
        return (first > second) ? first : second;
    }

    public static int getMaxOfThree(int first, int second, int third) {
        return getMaxOfTwo(getMaxOfTwo(first, second), third);
    }

    public static long computeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void calculateSum(int x, int y) {
        int totalSum = x + y;
        computedValue = totalSum;
        System.out.println("Sum calculated in calculateSum(): " + totalSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("The greater value is: " + getMaxOfTwo(num1, num2));

        System.out.print("Please enter three numbers: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        System.out.println("The greatest value is: " + getMaxOfThree(first, second, third));

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is: " + computeFactorial(number));

        System.out.print("Enter two numbers to add: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        calculateSum(a, b);

        System.out.println("Sum inside main() (using global variable): " + computedValue);

        scanner.close();
    }
}
