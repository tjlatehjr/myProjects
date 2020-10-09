import java.util.Scanner;

public class AverageOfNumbers {
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

        System.out.println("Average of numbers: " + (double) total/count);
    }
}
