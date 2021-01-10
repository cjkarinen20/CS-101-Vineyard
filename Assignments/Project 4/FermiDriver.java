public class FermiDriver
{
  public static void main(String [] args)
  {
    Fermi noArgsCons = new Fermi();
    System.out.println("No args:\nyour code should print the following info using toString()\n"
    + "number of guesses made: 0.\nnumber of guesses remaining: 10\n"
    + "this game is not over.\n<<");
    System.out.println(noArgsCons);
    System.out.println(">>");
 
    Fermi maxGuessCons = new Fermi(-1);
    System.out.println("Negative max guesses:\nyour code should print the following info using toString()\n"
    + "number of guesses made: 0.\nnumber of guesses remaining: infinite\n"
    + "this game is not over.\n<<");
    System.out.println(maxGuessCons);
    System.out.println(">>");
   
    Fermi digitsCons = new Fermi(1, 2, 3);
    System.out.println("Just digits:\nyour code should print the following info using toString()\n"
    + "number of guesses made: 0.\nnumber of guesses remaining: 10\n"
    + "this game is not over.\n<<");
    System.out.println(digitsCons);
    System.out.println(">>");
    System.out.println("your digits should be 1, 2, 3.  They are: " +
                        digitsCons.getDigitOne() + ", " +
                        digitsCons.getDigitTwo() + ", " +
                        digitsCons.getDigitThree() + ".");
                        
    Fermi digitsMaxCons = new Fermi(5, 6, 7, 2);
    System.out.println("Digits and max guesses (==2):\nyour code should print the following info using toString()\n"
    + "number of guesses made: 0.\nnumber of guesses remaining: 2\n"
    + "this game is not over.\n<<");
    System.out.println(digitsMaxCons);
    System.out.println(">>");
    System.out.println("your digits should be 5, 6, 7.  They are: " +
                        digitsMaxCons.getDigitOne() + ", " +
                        digitsMaxCons.getDigitTwo() + ", " +
                        digitsMaxCons.getDigitThree() + ".");                   
  
  
    //System.out.println("You have won 0 games.  Your code reports " + Fermi.getNumberOfGamesWon());
    //System.out.println("You have played 4 games.  Your code reports " + Fermi.getNumberOfGamesPlayed());
    
    System.out.println("guess all digits wrong, your code should report NANO NANO NANO" +
                        " your code reports\n<<");
    System.out.println(digitsMaxCons.guess(1,2,3));
    System.out.println(">>\n");
    System.out.println("guess all digits right, but wrong place. \nYour code should report PICO PICO PICO" +
                        " and should state that you have lost.  your code reports\n<<");
    System.out.println(digitsMaxCons.guess(7,5,6));
    System.out.println(">>\n");
    System.out.println("Making a guess on a lost game, guess should report game is over and is lost." +
                       "\nYour code reports:\n<<");
    System.out.println(digitsMaxCons.guess(1,2,3));
    System.out.println(">>\n");
    
    System.out.println("Test quit(). your code should print secret digits 1, 2, 3\n<<");
    System.out.println(digitsCons.quit());
    System.out.println(">>\n");
    
    System.out.println("Game over should be true, game won should be false.  Your code reports:\n\t" +
                        digitsCons.getGameFinished() + "\t" + digitsCons.getGameWon());
    System.out.println("create a game to win with digits 0 5 9");
    Fermi game = new Fermi(0, 5, 9, 100); //We will win this game, print results of guesses
    System.out.println("guess 2 5 7, response should be FERMI NANO NANO your code says\n<<");
    System.out.println(game.guess(2, 5, 7));
    System.out.println(">>\n");
    System.out.println("guess 2 3 8, response should be NANO NANO NANO your code says\n<<");
    System.out.println(game.guess(2, 3, 8));
    System.out.println(">>\n");
    System.out.println("guess 1 5 4, response should be FERMI NANO NANO your code says\n<<");
    System.out.println(game.guess(1, 5, 4));
    System.out.println(">>\n");
    System.out.println("guess 9 5 0, response should be FERMI PICO PICO your code says\n<<");
    System.out.println(game.guess(9, 5, 0));
    System.out.println(">>\n");
    System.out.println("Win the game. Your code says\n<<");
    System.out.println(game.guess(0, 5, 9));
    System.out.println(">>\nDid your code say you won the game? it should have.\n");
    //System.out.println("You have won 1 game.  Your code reports " + Fermi.getNumberOfGamesWon());
    //RSystem.out.println("You have played 5 games.  Your code reports " + Fermi.getNumberOfGamesPlayed());
  }
}