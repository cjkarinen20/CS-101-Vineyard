import java.util.*;

public class Fermi
{
   private int digitOne;
   private int digitTwo;
   private int digitThree;
   private int remainingGuesses;
   private int guessCountThisGame;
   private int numberOfGamesPlayed;
   private int numberOfSessionGuesses;
   private int numberOfGamesWon; 
   
   private final int DEFAULT_MAX_GUESSES = 10;
   
   private boolean gameFinished = false;
   private boolean gameWon = false;
   
   private String result;
   
   public Fermi()
   {
      Random r = new Random(); 
      digitOne = (r.nextInt(9) + 1); 
      digitTwo = (r.nextInt(9) + 1); 
      digitThree = (r.nextInt(9) + 1);
      remainingGuesses = DEFAULT_MAX_GUESSES; 
   }
   public Fermi(int maxGuesses)
   {
      Random r = new Random(); 
      digitOne = (r.nextInt(9) + 1); 
      digitTwo = (r.nextInt(9) + 1); 
      digitThree = (r.nextInt(9) + 1); 
      remainingGuesses = maxGuesses; 
   }
   public Fermi(int digitOne, int digitTwo, int digitThree)
   {
      this.digitOne = digitOne;
      this.digitTwo = digitTwo;
      this.digitThree = digitThree;
      remainingGuesses = DEFAULT_MAX_GUESSES; 
   }
   public Fermi(int digitOne, int digitTwo, int digitThree, int maxGuesses)
   {
      this.digitOne = digitOne;
      this.digitTwo = digitTwo;
      this.digitThree = digitThree;
      
      remainingGuesses = maxGuesses;
   }
   int getDigitOne()
   {
      return digitOne;
   }
   int getDigitTwo()
   {
      return digitTwo;
   }
   int getDigitThree()
   {
      return digitThree;
   }
   int getRemainingGuesses()
   {
      return remainingGuesses;
   }
   int getGuessCountThisGame()
   {
      return guessCountThisGame;
   }
   int getNumberOfGamesWon()
   {
      return numberOfGamesWon;
   }
   int getNumberOfGamesPlayed()
   {
      return numberOfGamesPlayed;
   }
   String guess(int digitOne, int digitTwo, int digitThree)
   {
      result = "";
      
         numberOfSessionGuesses++;
         guessCountThisGame++;
         int fermiGuesses = fermi(digitOne, digitTwo, digitThree);
         if (fermiGuesses == 3)
         {
            gameFinished = true;
            gameWon = true;
            numberOfGamesWon++;
            result = "Game win";
         }
         nano(digitOne, digitTwo, digitThree);
         pico(digitOne, digitTwo, digitThree);
         
         if (remainingGuesses > 0)
         {
            remainingGuesses--;
         }
         if (remainingGuesses == 0)
         {
            gameFinished = true;
            gameWon = false;
            result = "Game lost";
         }
         if (gameFinished)
         {  
            if (gameWon)
            {
               return "Game win";
            }
            else 
            {
               return "Game lost";
            }
         }
  
         
         
         
      return result;    
    }
   private int fermi(int guess1, int guess2, int guess3)
   {
      int inPositionGuesses = 0;
      if (guess1 == digitOne)
      {
         inPositionGuesses++;
         result += "FERMI ";
      }
      if (guess2 == digitTwo)
      {
         inPositionGuesses++;
         result += "FERMI ";
      }
      if (guess3 == digitThree)
      {
         inPositionGuesses++;
         result += "FERMI ";
      }
      return inPositionGuesses;
   }
   private void nano(int guess1, int guess2, int guess3)
   {
      if (guess1 != digitOne && guess1 != digitTwo && guess1 != digitThree)
      {
         result += "NANO ";
      }
      if (guess2 != digitOne && guess2 != digitTwo && guess2 != digitThree)
      {
         result += "NANO ";
      }
      if (guess3 != digitOne && guess3 != digitTwo && guess3 != digitThree)
      {
         result += "NANO ";
      }
   }
   private void pico(int guess1, int guess2, int guess3)
   {
      if (guess1 == digitTwo || guess1 == digitThree)
      {
         result += "PICO ";
      }
      if (guess2 == digitOne || guess2 == digitThree)
      {
         result += "PICO ";
      }
      if (guess3 == digitOne|| guess3 == digitTwo)
      {
         result += "PICO ";
      }
   }
   String quit()
   {
      gameFinished = true;
      gameWon = false;
      return digitOne + " " + digitTwo + " " + digitThree;
   }
   public String toString()
   {
      String info = "number of guesses made: " + numberOfSessionGuesses;
      if (remainingGuesses < 0)
      {
         info += "\nnumber of guesses remaining: infinite ";
      }
      else
      {
         info += "\nnumber of guesses remaining: " + remainingGuesses;
      }
      if (gameFinished)
      {
         info += "\nthis game is not over.";
      }
      else
      {
         info += "\nthis game is over.";
      } 
      return info;
   }
   boolean getGameFinished()
   {
      return gameFinished;
   }
   boolean getGameWon()
   {
      return gameWon;
   }
}