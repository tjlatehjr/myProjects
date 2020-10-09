import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, total = 0;

        while (true) {
            System.out.println("Give a number:");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            total += num;
        }
        System.out.println("Sum of numbers: " + total);
    }
}
