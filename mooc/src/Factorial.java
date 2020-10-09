import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end, factorial = 1;

        System.out.print("Give a number: ");
        end = scanner.nextInt();

        for (int i = 1; i <= end; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
