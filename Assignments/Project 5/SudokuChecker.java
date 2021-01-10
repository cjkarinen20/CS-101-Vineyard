import java.util.*;
import java.io.*;

public class SudokuChecker //CJ Karinen 101-02
{
   public static void main(String[] args) throws Exception
   {
      int[][] board = new int[9][9];
      
      String fileName = args[0];
      File input = new File(fileName);
      Scanner fileReader = new Scanner(input);
      
      while(fileReader.hasNext())
         {
            processPuzzle(board, fileReader);
            Sudoku puzzle = new Sudoku(board);
            puzzle.validSolution();
            if (puzzle.getIsValid() && puzzle.getIsComplete())
               System.out.println("This puzzle is a complete solution");
            else if (puzzle.getIsValid() && !(puzzle.getIsComplete()))
               System.out.println("This puzzle is a partial solution");
            else
               System.out.println("This puzzle is not a solution");
            System.out.println(puzzle);
         }  
   }
   static void processPuzzle(int[][] board, Scanner scanner)
   {
      for(int row = 0; row < 9; row++)
         {
            String inputRow = scanner.next();
            processRow(board, row, inputRow);
         }
   }
   static void processRow(int[][] board, int rowNum, String row)
   {
      for (int index = 0; index < 9; index++)
      {
         char digit = row.charAt(index);
         int intValue = digit - '0';
         board[rowNum][index] = intValue;
      }
   }
}