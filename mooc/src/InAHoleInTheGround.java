import java.util.Scanner;

public class InAHoleInTheGround {
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOFTimes;

        System.out.println("How many times? ");
        numOFTimes = scanner.nextInt();

        for (int i = 0; i < numOFTimes; i++) {
            printText();
        }
    }
}
