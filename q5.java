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
