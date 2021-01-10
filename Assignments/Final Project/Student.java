public class Student extends Person
{
   protected String status;
   public Student(String name, String address, String phoneNumber, String emailAddress, Date birthDate)
   {
      this.name = name;
      this.address = address;
      this.phoneNumber = phoneNumber;
      this.emailAddress = emailAddress;
      this.birthDate = birthDate;
   
   }
   public String getName()
   {
      return super.getName();
   }
   public String getAddress()
   {
      return super.getAddress();
   }
   

}