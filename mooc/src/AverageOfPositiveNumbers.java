import javax.swing.*;
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, total = 0, count = 0;

        while (true) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num < 0) {
                continue;
            }
            total += num;
            count++;
        }

        if (count == 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println((double) total / count);
        }
    }
}
