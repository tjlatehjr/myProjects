import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        num = scanner.nextInt();

        num *= num;
        System.out.println(num);
    }
}
