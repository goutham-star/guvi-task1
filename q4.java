import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        
       Scanner obj = new Scanner(System.in);

        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();

     int smallest;

     if (num1 <=num2 && num1 <= num3) {
        smallest = num1;
     }else if( num2<= num1 && num2<= num3){
     smallest = num2;
     }
     else{
        smallest = num3;
     }
     System.out.println("smallest number is " + smallest);
        
     obj.close();
     }

}
