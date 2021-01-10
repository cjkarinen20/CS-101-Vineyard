import java.util.*;
import java.io.*;

public class PersonSorter
{

   public static void main(String[] args) throws Exception
   {
      String inputName = args[0];
      File input = new File(inputName);
      String outputName = args[1];
      File output = new File(outputName);
      
      Scanner fileReader = new Scanner(input);
      PrintStream writer = new PrintStream(output);
      
      ArrayList<Person> persons = new ArrayList<Person>();
      
      writer.println("Person Sorter");
      writer.println("CJ Karinen - CS 101-02");
      while(fileReader.hasNext())
         {  
            String line = fileReader.next();
            writer.println("The following is an echo print: ");
            writer.println(line);
            String[] splitStr = null;
            for(int i = 0; i < line.length(); i++)
               {
                  splitStr = line.split("#");
               }
            if(splitStr[0].equals("u"))
               {  
                 processUStudent(splitStr, persons);
               }
            else if(splitStr[0].equals("g"))
               {
                 processGStudent(splitStr, persons);
               }
            else if(splitStr[0].equals("f"))
               {
                 processFaculty(splitStr, persons);
               }
            else if(splitStr[0].equals("s"))
               {
                 processStaff(splitStr, persons);
               }
         }
      writer.println("All Sorted by Alphabetical Order: ");
      ArrayList sortedList = sortList(persons);
      for(int i = 1; i < sortedList.size(); i++)
      {
         System.out.println(sortedList.get(i));
      }
   }
   public static ArrayList sortList(ArrayList<Person> a)
   {
      for(int i = 1; i < a.size(); i++)
      {
         for(int j = i + 1; j < a.size(); j++)
         {
            Person temp1 = (a.get(i));
            Person temp2 = (a.get(j));
            String name1 = temp1.getName();
            String name2 = temp2.getName();
            int nInt1 = Integer.parseInt(name1);
            int nInt2 = Integer.parseInt(name2);
            
            if (nInt1 > nInt2)
               {
                  a.set(i, temp2);
                  a.set(j, temp1);
               }   
         }
      } 
      return a; 
   }
   public static void processUStudent(String[] strArray, ArrayList<Person> pList)
   {
      String name = strArray[1];
      String address = strArray[2];
      String phoneNumber = strArray[3];
      String emailAddress = strArray[4];
      String dateString = strArray[5];
      Date bDate = new Date(dateString);
      String status = strArray[6];
      Student uStudent = new UndergraduateStudent(name, address, phoneNumber, emailAddress, bDate, status);
      pList.add(uStudent);
   }
   public static void processGStudent(String[] strArray, ArrayList<Person> pList)
   {
      String name = strArray[1];
      String address = strArray[2];
      String dateString = strArray[3];
      String phoneNumber = strArray[4];
      String emailAddress = strArray[5];
      int level = Integer.parseInt(strArray[6]);
      String assistantship = strArray[7];
      Date bDate = new Date(dateString);
      Student gStudent = new GraduateStudent(name, address, bDate, phoneNumber, emailAddress, level, assistantship);
      pList.add(gStudent);
   }
   public static void processFaculty(String[] strArray, ArrayList<Person> pList)
   {
      String name = strArray[1];
      String address = strArray[2];
      String phoneNumber = strArray[3];
      String emailAddress = strArray[4];
      String office = strArray[5];
      double salary = Double.parseDouble(strArray[6]);
      String dateString = strArray[7];
      String title = strArray[8];
      String officeHours = strArray[9];
      Date hDate = new Date(dateString);
      Employee fEmployee = new Faculty(name, address, phoneNumber, emailAddress, office, salary, hDate, title, officeHours);
      pList.add(fEmployee);
   }
   public static void processStaff(String[] strArray, ArrayList<Person> pList)
   {
      String name = strArray[1];
      String address = strArray[2];
      String title = strArray[3];
      String phoneNumber = strArray[4];
      String emailAddress = strArray[5];
      String office = strArray[6];
      double salary = Double.parseDouble(strArray[7]);
      String dateString = strArray[8];
      String supervisorName = strArray[9];
      Date hDate = new Date(dateString);
      Employee sEmployee = new Staff(name, address, title, phoneNumber, emailAddress, office, salary, hDate, supervisorName);
      pList.add(sEmployee);
   }
}