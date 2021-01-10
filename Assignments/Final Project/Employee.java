public class Employee extends Person
{

   protected String office;
   protected String title;
   protected double salary;
   protected Date hiringDate;
   
   public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date hiringDate, String title, String officeHours)
   {
      this.name = name;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.emailAddress = emailAddress;
      this.hiringDate = hiringDate;
      this.office = office;
      this.salary = salary;
      this.title = title;  
   }
   public String getName()
   {
      return super.getName();
   }
   public double getSalary()
   {
      return salary;
   }






}