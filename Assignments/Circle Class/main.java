
import java.util.*;

public class main
{
   public static void main(String [] args)
   {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(12.5, "Green");
      
		c1.print(); 
		c2.print();
		
		System.out.println("Enter the radius :");
		double r = input.nextDouble();
		
		c1.setRadius(r);
		
		c1.print();
		
	}





}