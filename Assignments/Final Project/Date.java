class Date
{
   private int month;
   private int day;
   private int year;
   
   public Date(String date)
   {
      String[] splitDate = null; 
      for (int i = 0; i < date.length(); i++)
         splitDate = date.split("/");
      this.month = Integer.parseInt(splitDate[0]);
      this.day = Integer.parseInt(splitDate[1]);
      this.year = Integer.parseInt(splitDate[2]);
   }
   public String toString()
   {
      if (month == 1)
         return "January " + day + ", " + year;
      if (month == 2)
         return "Febuary " + day + ", " + year;
      if (month == 3)
         return "March " + day + ", " + year;
      if (month == 4)
         return "April " + day + ", " + year;
      if (month == 5)
         return "May " + day + ", " + year;
      if (month == 6)
         return "June " + day + ", " + year;
      if (month == 7)
         return "July " + day + ", " + year;
      if (month == 8)
         return "August " + day + ", " + year;
      if (month == 9)
         return "September " + day + ", " + year;
      if (month == 10)
         return "October " + day + ", " + year;
      if (month == 11)
         return "November " + day + ", " + year;
      if (month == 12)
         return "December " + day + ", " + year;
      return null;
   }
   public int compareTo(Date date)
   {
      if (this.month == date.getMonth())
         {
            if (this.day == date.getDay())
               {
                  if(this.year == date.getYear())
                     {
                        return 1;
                     }
               }
         }
      return 0;   
   }
   public int getMonth()
   {
      return month;
   }
   public int getDay()
   {
      return day;
   }
   public int getYear()
   {
      return year;
   }
}