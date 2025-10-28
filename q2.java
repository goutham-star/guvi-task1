import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number");

int number = obj.nextInt();

int reversed = 0;

while (number !=0) {
    int digit = number % 10;
    reversed = reversed * 10 +digit;
    number = number / 10 ;
}
System.out.println("Reversed number: " + reversed);

obj.close();
    }
}
