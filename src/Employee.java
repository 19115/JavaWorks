/* a code to find the bonus amount using the hardcode variables
 by : Lilian Kibunja
 CT101/G/19115/23
 BSC Computer Science
 */
public class Employee {
    public static void main (String[]args){
       int salary=36000,years=8;//get the salary and the number of years
      double bonus;//initialize the bonus variable
        //the if else to determine the percentage of the bonus
        if (years>10){
           bonus=0.12;
        }
        else if (years>=6 && years<=10){
            bonus=0.1;
        }
        else{
            bonus=0.08;
        }
        // initializing the bonus amount
      double amount=salary*bonus;
        System.out.println("The amount is: " + amount);//printing out the amount
    }
}
