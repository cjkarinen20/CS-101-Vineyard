import java.util.*;

public class QuizScore
{
   public static void main(String[] args)
   {
      Scanner kyBrd = new Scanner(System.in);
      String quizScore = scoreAssigner(kyBrd);
      System.out.println(quizScore);
      
   
   
   
   
   
   
   
   }
   public static String scoreAssigner(Scanner s)
   {
      System.out.println("What was your quiz score? ");
      int score = s.nextInt();
      String grade = "";
      
      switch(score)
      {
         case 10:
            grade = "A";
            break;
         case 9:      
            grade = "A";
            break;
         case 8:
            grade = "B";
            break;
         case 7:       
            grade = "C";
            break;
         case 6:     
            grade = "D";
            break;
         case 5:     
            grade = "E";
            break;
         case 4:     
            grade = "E";
            break;
         case 3:     
            grade = "E";
            break;
         case 2:     
            grade = "E";
            break;
         case 1:     
            grade = "E";
            break;
         case 0:     
            grade = "E";
            break;

         default:          
            grade = "U";
      
      }
      
      return grade;
   
   
   }
   







}