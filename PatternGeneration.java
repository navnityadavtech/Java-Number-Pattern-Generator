import java.util.Scanner;

public class PatternGeneration{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("      NUMBER PATTERN GENERATOR");
        System.out.println("======================================");

        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();

        // Pattern 1
        System.out.println("\nPattern 1: Number Triangle");
        System.out.println("---------------------------");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Pattern 2
        System.out.println("\nPattern 2: Inverted Number Triangle");
        System.out.println("------------------------------------");

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n======================================");
        System.out.println("      Pattern Generation Complete");
        System.out.println("======================================");

        scan.close();
    }
}