import java.util.Scanner;

public class NumnerOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, count = 0;

        while (true) {
            System.out.println("Give a number:");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            } else if (num < 0) {
                count++;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
