import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        do {
            double width, height;

            System.out.print("Enter the width of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();
            }
            width = scanner.nextDouble();

            System.out.print("Enter the height of the rectangle: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();
            }
            height = scanner.nextDouble();

            double area = width * height;
            System.out.println("Area of the rectangle: " + area);

            double perimeter = 2 * (width + height);
            System.out.println("Perimeter of the rectangle: " + perimeter);

            double diagonal = Math.sqrt(width * width + height * height);
            System.out.println("Length of the diagonal: " + diagonal);

            System.out.print("Do you want to calculate again? (Y/N): ");
            String input = scanner.next();
            done = !input.equalsIgnoreCase("Y");

        } while (!done);

        System.out.println("Program terminated. Thanks for using the Rectangle Calculator!");
        scanner.close();
    }
}