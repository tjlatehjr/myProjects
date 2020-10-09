public class AdvancedAstrology {
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void christmasTree(int height) {
        int num = 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(height-i);
            printStars(num);
            num += 2;
        }

        // Base
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void main(String[] args) {
        printTriangle(4);

        System.out.println();
        christmasTree(10);
    }
}
