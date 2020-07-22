//CentimetersToInches - convert centimeters to inches

//CJ Karinen
//CS101 - 02

public class CentimetersToInches
{

  

  public static void main(String [] args)
  {
  //declare a double constant CM_TO_INCHES and assign it the value 2.54
  //  because there are 2.54 centimeters per inch.  Write code below this comment
  final double CM_TO_INCHES = 2.54;

  //declare a double variable named centimeters.  Assign some value to this variable
  //  such as 254.
  double centimeters = 254;

  //declare a double variable named inches.  put the result of dividing centimeters
  // by CM_TO_INCHES in the variable inches.
  double inches = (centimeters / CM_TO_INCHES);

  //Write the values centimeters and inches to the screen, using good labels.
  //  For example, the result printed on the screen could be:
  //  There are 100 inches in 254 centimeters.
  System.out.println("There are " + inches + " inches in " + centimeters + " centimeters.");


  }
}
