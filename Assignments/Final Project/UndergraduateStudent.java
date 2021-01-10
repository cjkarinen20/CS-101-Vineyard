public class UndergraduateStudent extends Student
{
   protected String status;
   public UndergraduateStudent(String name, String address, String phoneNumber, String emailAddress, Date birthDate, String status)
   {
      super(name, address, phoneNumber, emailAddress, birthDate);
      this.status = status;
   }
   public String toString()
   {
      String uGrad = "Undergraduate Student";
      uGrad += "\n\tname: " + name;
      uGrad += "\n\taddress: " + address;
      uGrad += "\n\tphone number: " + phoneNumber;
      uGrad += "\n\temail-address: " + emailAddress;
      uGrad += "\n\tbirth date: " + birthDate.toString();
      uGrad += "\n\tstatus: " + status;
      return uGrad;
   }
   public String getName()
   {
      return super.getName();
   }





}