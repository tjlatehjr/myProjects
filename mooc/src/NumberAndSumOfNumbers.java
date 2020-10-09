import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, total = 0, count = 0;

        while (true) {
            System.out.println("Give a number:");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            total += num;
            count++;
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of numbers: " + total);
    }
}
