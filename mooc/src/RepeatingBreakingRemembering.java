import java.util.Scanner;

public class RepeatingBreakingRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0, count = 0, even = 0, odd = 0;

        System.out.println("Give numbers: ");
        while(true) {
            num = scanner.nextInt();
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (num % 2 == 0) {
                even++;
            } else if (num % 2 == 1) {
                odd++;
            }
            sum += num;
            count++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double) sum/count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
