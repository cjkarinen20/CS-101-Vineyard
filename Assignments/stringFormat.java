public class stringFormat
{
   public static void main(String[] args)
   {
      String name = "CJ Karinen";
      
      String n = nameFormat(name);
      
      System.out.println(n);
   
   
   }
   public static String nameFormat(String name)
   {
      int space = name.indexOf(" ");
      
      String formattedName = "";
      String firstName = name.substring(0, space);
      String lastName = name.substring(space);
      
      formattedName = lastName + ", " + firstName;
      
      return formattedName;
   }





}