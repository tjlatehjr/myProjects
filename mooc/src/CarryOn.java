import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        while (true) {
            System.out.println("Shall we carry on?");
            response = scanner.nextLine();
            if (response.equals("no")) {
                break;
            }
        }
    }
}
