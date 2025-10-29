import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

      Scanner obj = new Scanner(System.in);
     double amount = obj.nextDouble();
     double discountpercent = obj.nextDouble();
     double discount = (amount * discountpercent) / 100;
     double finalamount = amount - discount;

     System.out.println("purchase amount: "+ amount);
     System.out.println("Discount (" + discountpercent + "%):"+ discount);
     System.out.println("Final payable amount: " + finalamount);

     obj.close();
    }
}


// output

// purchaseamount :1500 
// discountpercentage :20
// purchase amount: 1500.0
// Discount (20.0%):300.0
// Final payable amount: 1200.0