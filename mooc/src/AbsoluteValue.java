import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        if (value < 0) {
            value *= -1;
            System.out.println(value);
        } else {
            System.out.println(value);
        }
    }
}
