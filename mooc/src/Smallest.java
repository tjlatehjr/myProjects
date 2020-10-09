public class Smallest {
    public static int smallest(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }

    public static void main(String[] args) {
        int answer = smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }
}
