public class Faculty extends Employee
{
   protected String officeHours;
   
   public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date hiringDate, String title, String officeHours)
   {
      super(name, address, phoneNumber, emailAddress, office, salary, hiringDate, title, officeHours);
      this.officeHours = officeHours;
   
   }
   public String toString()
   {
      String faculty = "Faculty";
      faculty += "\n\tname: " + name;
      faculty += "\n\taddress: " + address;
      faculty += "\n\tphone number: " + phoneNumber;
      faculty += "\n\temail-address: " + emailAddress;
      faculty += "\n\toffice: " + office;
      faculty += "\n\tsalary: $" + salary;
      faculty += "\n\thiring date: " + hiringDate.toString();
      faculty += "\n\toffice hours: " + officeHours;
      return faculty;
   }



}