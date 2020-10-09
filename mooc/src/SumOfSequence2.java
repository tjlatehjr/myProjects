import java.util.Scanner;

public class SumOfSequence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end, sum = 0;

        System.out.print("First number? ");
        start = scanner.nextInt();
        System.out.print("Last number? ");
        end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
