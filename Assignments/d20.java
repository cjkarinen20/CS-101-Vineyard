import java.util.*;

public class d20
{

   public static void main(String[] args)
   {
      int i = 0;
      while(i != 20)
      {
         i = diceRoll();
         System.out.println(i);
      }
   
   }
   public static int diceRoll()
   {
      Random die = new Random();
      int roll = die.nextInt(20);
      return (roll + 1);
   }








}