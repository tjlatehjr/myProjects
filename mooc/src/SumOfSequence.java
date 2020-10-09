import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end, sum = 0;

        System.out.print("Last number? ");
        end = scanner.nextInt();

        for (int i = 1; i <= end; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
