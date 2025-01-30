/* our simple interest using the user input values
by Lilian Kibunja
CT101/G/19115/23
 */
import java.util.Scanner; // Import Scanner for user input

public class SimpleInterest {//our file name
    public static double getDiscount(double amount) {//the method name is getDiscount
        double discount = 0;
        if (amount > 5000) {
            discount = 0.1 * amount;
            System.out.println("The discount is: " + discount);
        } else if (amount > 1000 && amount <= 5000) {
            discount = 0.05 * amount;
            System.out.println("The discount is: " + discount);
        } else {
            System.out.println("No discount.");
        }
        return discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object


        System.out.print("Enter the amount: ");// Ask the user for input
        double amount = scanner.nextDouble(); // Read user input

        double discount = getDiscount(amount);
        System.out.println("Total amount after discount: " + (amount - discount));

        scanner.close(); // Close the scanner
    }
}

