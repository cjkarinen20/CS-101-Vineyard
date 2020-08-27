import java.util.*;

public class Exam1
{
   public static void main(String[] args)
   {
       Scanner kbrd = new Scanner(System.in);
       System.out.println("Enter name: ");
       String name = kbrd.next(); 
       System.out.println("Price of game: ");
       float price = kbrd.nextFloat();
       System.out.println("Enter age requirement: ");
       int ageReq = kbrd.nextInt();
       if (ageReq < 10)
       {
         System.out.println(name);
       }
       if (ageReq >= 10 && ageReq <= 18)
       {
         System.out.println(ageReq);
       }
       if (ageReq >= 19)
       {
         System.out.println(price);
       }
 
   
   }
   





}
