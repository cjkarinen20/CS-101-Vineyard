public class GraduateStudent extends Student
{
   protected int level;
   protected String assistantship;
   public GraduateStudent(String name, String address, Date birthDate, String phoneNumber, String emailAddress, int level, String assistantship)
   {
      super(name, address, phoneNumber, emailAddress, birthDate);
      this.level = level;
      this.assistantship = assistantship;
   }
   public String toString()
   {
      String grad = "Graduate Student";
      grad += "\n\tname: " + name;
      grad += "\n\taddress: " + address;
      grad += "\n\tbirth date: " + birthDate.toString();
      grad += "\n\tphone number: " + phoneNumber;
      grad += "\n\temail-address: " + emailAddress;  
      grad += "\n\tlevel: " + level;
      grad += "\n\tassistantship: " + assistantship;
      return grad;
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