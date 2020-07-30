import java.util.*;

public class minNum
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in); 
      numReader(keyboard); 
   }
   public static void numReader(Scanner s)
   {
      System.out.println("Enter 3 int values: ");
      int num1 = s.nextInt();
      int num2 = s.nextInt();
      int num3 = s.nextInt();
      
      int min1 = Math.min(num1,num2);
      int min2 = Math.min(num2,num3);
      int min3 = Math.min(min1, min2);
      System.out.println("The minimum value is: " + min3);
      
      int sum = Math.abs(num1) + Math.abs(num2) + Math.abs(num3);
      System.out.println("The absolute sum of the three is: " + sum);
   }








}