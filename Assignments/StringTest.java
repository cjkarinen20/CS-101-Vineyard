import java.util.*;

public class StringTest
{
   public static void main(String[] args)
   {
         Scanner scn = new Scanner(System.in);
         dateParse(scn);
   
   }
   private static void dateParse(Scanner s)
   {
      System.out.println("Please input a date [mm/dd/yyy]:");
      String date = s.next();
      if (date.contains("/"))
      {
         String sndHalf = date.substring(date.indexOf("/") + 1);
         if (sndHalf.contains("/"))
         {
            boolean parse = dateCheck(date);
            if (parse == true)
            {
               System.out.println("Valid Format");
            }
            else if (parse == false)
            {
            System.out.println("Invalid Format");
            }
         }
        
      }   
   }
   private static boolean dateCheck(String date)
   {
      int mm = Integer.parseInt(date.substring(0, date.indexOf("/")));
      int dd = Integer.parseInt(date.substring(date.indexOf("/") + 1, date.lastIndexOf("/")));
      int yyyy = Integer.parseInt(date.substring(date.lastIndexOf("/") + 1));
      
      boolean leapYr = false;
      boolean validity = false;
      
      if (mm > 0 && mm <= 12)
      {
         if (dd > 0 && dd <= 31)
         {
            if (yyyy > 0000 && yyyy <= 9999)
            {
               if (yyyy % 4 == 0)
                  leapYr = true;
               else if (yyyy % 100 == 0)
               {
                  if (yyyy % 400 == 0)
                     leapYr = true;
               }
            }
            if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)
            {
               if (!(dd > 31))
               {
                  validity = true;
                  return validity;
               }
            }
            else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
            {
               if (!(dd > 30))
               {
                  validity = true;
                  return validity;
               }
            }
            else if (mm == 02)
            {
               if (leapYr == true)
               {
                  if (!(dd > 29))
                  {
                     validity = true;
                     return validity;
                  }
               }
               else if (leapYr == false)
               {
                  if (!(dd > 28))
                  {
                     validity = true;
                     return validity;
                  }
               }
            }
         }
         else
         {
            return validity;
         }
      }
      return validity;
   }
}