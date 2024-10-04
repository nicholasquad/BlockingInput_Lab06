import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0;
        double height = 0;

        // Input for width
        System.out.print("Enter the width of the rectangle: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width > 0) {
                    break; // Valid input
                } else {
                    System.out.println("Please enter a positive number for the width.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for the width.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Input for height
        System.out.print("Enter the height of the rectangle: ");
        while (true) {
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0) {
                    break; // Valid input
                } else {
                    System.out.println("Please enter a positive number for the height.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for the height.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Calculate area, perimeter, and diagonal
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        // Display the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);

        scanner.close(); // Close the scanner
    }
}