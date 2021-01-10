public class Staff extends Employee
{
   protected String supervisorName;

   public Staff(String name, String address, String title, String phoneNumber, String emailAddress, String office, double salary, Date hiringDate, String supervisorName)
   {
      super(name, address, phoneNumber, emailAddress, office, salary, hiringDate, title, officeHours);
      this.supervisorName = supervisorName;
      this.title = title;
   }
   public String toString()
   {
      String staff = "Staff";
      staff += "\n\tname: " + name;
      staff += "\n\taddress: " + address;
      staff += "\n\tphone number: " + phoneNumber;
      staff += "\n\temail-address: " + emailAddress;
      staff += "\n\toffice: " + office;
      staff += "\n\tsalary: $" + salary;
      staff += "\n\thiring date: " + hiringDate.toString();
      staff += "\n\tsupervisor name: " + supervisorName;
      return staff;
   }
   public String getName()
   {
      return super.getName();
   }
}