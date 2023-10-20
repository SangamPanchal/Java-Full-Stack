import java.util.Scanner;

public class LeftHollowTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Print '*' for the first column, last column, and the first row
                // to create the hollow triangle
                if (j == 1 || j == i || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            scanner.close();
        }
    }
}