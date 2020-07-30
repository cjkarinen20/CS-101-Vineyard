public class numMethod
{
   public static void main(String[] args)
   { 
      int num1 = 3;
      int num2 = 6;
      int min = minNum(num1, num2);
      System.out.println(min);
   }
   public static int minNum(int n1, int n2)
   {
      int min = Math.min(n1, n2);
      return min;
   }
}