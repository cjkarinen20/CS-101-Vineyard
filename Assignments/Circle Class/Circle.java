public class Circle
{

  double radius;
  static final double PI = 3.14;
  static int count = 0;
  
  public Circle ()
	{
		radius = 10;
	}
	
	public Circle(double r, String c)
	{
		radius = r;
		count++;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		radius = r;
	}
	void print()
	{
		System.out.println("Radius: " +radius+"\nArea: "+findArea() +"\nCircumference: " + findCircumference());
	}
	double findArea()
	{
		return PI*radius*radius;
	}
   double findCircumference()
   {
      return PI * radius * 2;
   }
   











}