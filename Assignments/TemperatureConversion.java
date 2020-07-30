//Comments - purpose of this code
//CJ Karinen - your name
//CS 101-02 - your course and section number

public class TemperatureConversion
{
  public static void main(String [] args)
  {
    //declare any constants here

    //declare a variable for the temperature in Fahrenheit as an int.
    //use a meaningful variable name and follow the naming conventions
    //assign a value to this variable
    
    int tempF = 92;

    //Write your Fahrenheit temperature to the screen using good labels for
    // your output
    
    System.out.println("The temperature is " + tempF + " degrees Fahrenheit.");
    

    //declare a value for the temperature in Celsius (or Centigrade), also
    //as an int variable.  
    int tempC = 0;

    //convert the Fahrenheit temperature to Celsius and store it in
    //your variable for Celsius temperature declared in the last step.
    double fToCelsius = (tempF-32) * 5/9.0;
    tempC = (int)fToCelsius;
    //Ouput the Celsius temperature, use good labels.
    System.out.println("The temperature is " + tempC + " degrees Celcius.");
    //Convert the Celsius temperature back to Fahrenheit and print the
    // results, using good labels.
    double celsiusToF = (tempC * 9/5.0) + 32;
    tempF = (int)celsiusToF;
    System.out.println(tempF + " degrees Fahrenheit is equal to " + tempC + " degrees Celsius.");  
  }
}
