import java.util.*;

public class NumPrinter
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      numSorter(keyboard);
   
   }
   public static void numSorter(Scanner s)
   {
      System.out.println("Enter 3 int values: ");
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();
      
       
      if (a > b)
      {
         if (b > c)
         {
            System.out.println(c + ", " + b + ", " + a);
         }
         else if (b < c)
         {
            if (a < c)
            {
               System.out.println(b + ", " + a + ", " + c);
            }
            else
            {
               System.out.println(b + ", " + c + ", " + a);
            }
         }
         
      }      
      else if (a < b)
      {
        if (b < c)
        {
            System.out.println(a + ", " + b + ", " + c);
        }
        else if (b > c)
        {
            if (a > c)
            {
               System.out.println(c + ", " +  a + ", " + b);
            }
            else
            {
               System.out.println(a + ", " +  c + ", " + b);
            }
        }
      }
      
            
   }
}