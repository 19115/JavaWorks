/* the simple interest using the handcoded values
 coded by: Kibunja Lilian
 CT101/G/19115/23
 */
public class Interest {
    public static double getDiscount(double amount) {//the method name is getDiscount
        double discount = 0;//initializing the discount
        if (amount > 5000) {
            discount = 0.1 * amount;
            System.out.println("The discount is: " + discount);//concatinating the string
        } else if (amount > 1000 && amount <= 5000) {
            discount = 0.05 * amount;
            System.out.println("The discount is: " + discount);
        } else {
            System.out.println("No discount.");
        }
        return discount;//returning the discount to enhance reusability
    }

    public static void main(String[] args) {//the main function
        double amount = 600;
        double discount = getDiscount(amount);
        System.out.println("Total amount after discount: " + (amount - discount));
    }
}
