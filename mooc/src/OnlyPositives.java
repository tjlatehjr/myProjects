import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Give a number:");
            num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Unsuitable number");
            } else if (num == 0) {
                break;
            } else {
                num = (int)Math.pow(num, 2);
                System.out.println(num);
            }
        }
    }
}
