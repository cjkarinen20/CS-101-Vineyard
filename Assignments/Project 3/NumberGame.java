import java.util.*;

public class NumberGame
{
   public static void main(String[] args)
   {
      Scanner scn = new Scanner(System.in); //for scanning in user input
      guessingGame(scn); //calls the method that will call all other methods for our game
   }
   private static int numRange(Scanner s) //processes user input to obtain the maximum value used for number generation
   {
      System.out.println("Please provide a maximum value: "); //prompt for input
      return s.nextInt(); //returns the inputted maximum value for number generation
   }
   private static int randomNumber(Scanner s, int max) //generates a random number between 1 and max (inclusive)
   {
      Random r = new Random(); //new random object to be used in number generation
      int num = r.nextInt(max); //newly generated random integer value
      return (num + 1); //returns num + 1 in order the make the value generated inclusive (i.e. less than or equal to the maximum)
   }
   private static int difficultySelector(Scanner s, int num) //takes in a user choice and outputs an int to represent the difficulty chosen
   {
      System.out.println("Please select a difficulty:\n1. Easy\n2. Hard"); //Prompt for input
      if (!(s.hasNextInt())) //checks to make sure that the input is an int
      {
         System.out.println("Please input the selection number: "); //prompt for valid input
         int input = s.nextInt(); //int input is equal to our input value
      }
      int input = s.nextInt(); //int input is equal to our input value
      if (input == 1) //if the selection was selection 1, then we return 1
      {
         return 1; //represents the selection made by the user
      }
      if (input == 2) //if the selection was selection 2, then we return 2
      {
         return 2; //represents the selection made by the user
      }
      else
      {
         return 1; //represents a default selection incase the input was out of range
      }
   }
   private static int calculateGuesses(Scanner s, int num, int max) //Calculates the number of guesses based on the difficulty and maximum selected
   {
      int difficulty = difficultySelector(s, num); //assigns the int returned by difficultySelector
      if (difficulty == 1) //if difficulty was 1 (Easy)
      {
         return max/2; //then guesses equals the maximum divided by two
      }
      else if (difficulty == 2) //if difficulty was 2 (Hard)
      {
         int i = max; //copies max into int i
         int count = 0; //number of times that i can be divided by two
         while (i > 0) // while i is less than 0
         {
            i = i/2; //i equals i divided by two (increments i)
            count++; //the number of divisions increases by one
         }
         return count; //count is returned as the value used for the number of guesses the user has on Hard difficulty
      }
      return 0; //default return value
   }
   private static void numGuess(Scanner s, int num, int guesses, int c) //the core gameplay of guessing the value
   {
      System.out.println("Guess the number: "); //prompt for input
      int guess = s.nextInt(); //copies the input into the integer 'guess'
      if (guess == num) //if guess equals the value
      {
         c++; //number of guesses used increases by one
         guesses--; //total guesses left
         System.out.println("You Won!\nGuesses used: " + c);
      }
      else if (guess > num) //if guess is too large
      {
        if (guesses > 0) //check to make sure the user has guesses left to use
         {
            System.out.println("Your guess was too large!\nDo you want to guess again?\nY or N?"); //prompt for retry
            String answer = s.next(); //copy the input for use in the method restartGame
            c++; //number of guesses used goes up
            guesses--; //total guesses left goes down
            restartGame(s,answer, c, num, guesses); //calls the restart method
         }
         else if (guesses <= 0) //if there are no more guesses left
         {
            System.out.println("Out of guesses!\nThe number was: " + num + "\nNumber of guesses used: " + c); //game over message
         }      
       }
      else if (guess < num) //if guess is too small
      {  
         if (guesses > 0)//check to make sure the user has guesses left to use
         {
            System.out.println("Your guess was too small!\nDo you want to guess again?\nY or N?"); //prompt for retry
            String answer = s.next(); //copy the input for use in the method restartGame
            c++; //number of guesses used goes up
            guesses--; //total guesses left goes down
            restartGame(s,answer, c, num, guesses); //calls the restart method
         }
         else if (guesses <= 0) //if there are no more guesses left
         {
            System.out.println("Out of guesses!\nThe number was: " + num + "\nNumber of guesses used: " + c); //game over message
         }
      }
   }
   private static void restartGame(Scanner s, String a, int count, int num, int guesses) //restarts the main game loop by calling numGuess
   {
      if (a.equals("Y")) //if the input was 'Yes'
         {
            numGuess(s, num, guesses, count); //restarts the main gameplay
         }
         else if (a.equals("N")) //if the input was 'No'
         {
            System.out.println("You lost!\nThe number was: " + num + "\nNumber of guesses used: " + count); //game over message
         }
   }
   private static void guessingGame(Scanner s) //combines all of the previous methods together into a neat package
   {
      int max = numRange(s); //assigns int max to the value returned by numRange
      int num = randomNumber(s, max); //assigns int num to the value returned by randomNumber
      int guesses = calculateGuesses(s, num, max); //assigns int guesses to the value returned by calculateGuesses
      int count = 0; //assigns the number of guesses used to be 0
      numGuess(s, num, guesses, count); //calls the main gameplay method
   }
}