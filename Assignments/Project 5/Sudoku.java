public class Sudoku //CJ Karinen 101-02
{
   private int[][] board;
   
   private boolean isComplete;
   private boolean isValid;
   
   public Sudoku(int[][] board)
   {
      this.board = board;
      
   
   }
   public String toString()
   {
      String s = "";
      for(int row = 0; row < 9; row++)
         {
            if (row == 3 || row == 6)
                     {
                        s += "------+------+------\n";
                     }
            for(int column = 0; column < 9; column++)
               {
                  if (column == 3 || column == 6)
                     {
                        s += "|";
                     }
                  s += (" " + board[row][column]);
               }
               s += "\n";  
         }
      return s;
   }
   boolean getIsValid()
   {
      return isValid;
   }
   boolean getIsComplete()
   {
      return isComplete;
   }
   private boolean validRow(int rowNum)
   {
      int[] count = new int[10]; 
      for(int column = 0; column < board[rowNum].length; column++)
         {
            count[board[rowNum][column]]++;
         }
      for(int index = 1; index < count.length; index++)
         {
            if (count[index] > 1)
               {
                  return false;
               }
         }
         if (count[0] > 0)
            {
               isComplete = false;
            }
         else
            {
               isComplete = true;
            }
         return true;
   }
   private boolean validColumn(int columnNum)
   {
      int[] count = new int[10]; 
      for(int row = 0; row < board.length; row++)
         {
            count[board[row][columnNum]]++;
         }
      for(int index = 1; index < count.length; index++)
         {
            if (count[index] > 1)
               {
                  return false;
               }
         }
         return true;
   }
   private boolean validGrid(int blockNum)
   {
      int[] count = new int[10];
      
      if (blockNum == 0)
         {
            for(int row = 0; row < 3; row++)
               {
                  for(int column = 0; column < 3; column++)
                     {
                        count[board[row][column]]++;
                     }
               }
         }
       if (blockNum == 1)
         {
            for(int row = 0; row < 3; row++)
               {
                  for(int column = 3; column < 6; column++)
                     {
                        count[board[row][column]]++;
                     }
               }
         }
        if (blockNum == 2)
         {
            for(int row = 0; row < 3; row++)
               {
                  for(int column = 6; column < 9; column++)
                     {
                        count[board[row][column]]++;
                     }
               }
         }
        if (blockNum == 3)
         {
            for(int row = 3; row < 6; row++)
               {
                  for(int column = 0; column < 3; column++)
                     {
                        count[board[row][column]]++;
                     }
               }
         }
        if (blockNum == 4)
         {
            for(int row = 3; row < 6; row++)
               {
                  for(int column = 3; column < 6; column++)
                     {
                        count[board[row][column]]++;
                     }
               }
         }
        if (blockNum == 5)
         {
            for(int row = 3; row < 6; row++)
               {
                  for(int column = 6; column < 9; column++)
                     {
                        count[board[row][column]]++;
                     }
               }
         }
        if (blockNum == 6)
         {
            for(int row = 6; row < 9; row++)
               {
                  for(int column = 0; column < 3; column++)
                     {
                        count[board[row][column]]++;
                     }
               }
         }
        if (blockNum == 7)
         {
            for(int row = 6; row < 9; row++)
               {
                  for(int column = 3; column < 6; column++)
                     {
                        count[board[row][column]]++;
                     }
               }
         }
        if (blockNum == 8)
         {
            for(int row = 6; row < 9; row++)
               {
                  for(int column = 6; column < 9; column++)
                     {
                        count[board[row][column]]++;
                     }
               }
         }
        for(int index = 1; index < count.length; index++)
         {
            if (count[index] > 1)
               {
                  return false;
               }
         }
        return true; 
   }
   boolean validSolution()
   { 
     int validRows = 0;
     int validColumns = 0;
     int validGrids = 0;
     
     for (int row = 0; row < 9; row++)
      {
         if (validRow(row))
            validRows++;
      }
     for (int column = 0; column < 9; column++)
      {
         if(validColumn(column))
            validColumns++;
      }
     for (int grid = 0; grid < 9; grid++)
      {
         if(validGrid(grid))
            validGrids++;
      }
     if (validRows == 9 && validColumns == 9 && validGrids == 9)
      {
         isValid = true;
         return isValid;
      }
   isValid = false;   
   return isValid;
   }
}