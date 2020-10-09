import java.util.Scanner;

public class NumbersOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, count = 0;

        while (true) {
            System.out.println("Give a number:");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            count++;
        }

        System.out.println("Number of numbers: " + count);
    }
}
