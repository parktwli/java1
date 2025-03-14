import java.util.*;
class Data
{	
	Scanner sc= new Scanner(System.in);
	protected int radius;
	public void getInfo()
	{	
		System.out.println("Enter the radius:");
		radius=sc.nextInt();
	}
	
}
class Circle extends Data
{
	private double Area,Perimeter;
	public void calc()
	{
		Perimeter=3.14159*radius*2.00;
		Area=3.14159*radius*radius;
	}
	public void display()
	{
		System.out.println("Perimeter:"+Perimeter);
		System.out.println("Area:"+Area);
	}
}
class Sphere extends Data
{
	private double sarea,volume;
	public void calc()
	{
		sarea=4.00*3.14159*radius*radius;
		volume=sarea*radius/3.00;
	}
	public void display()
	{
		System.out.println("Surface Area:"+sarea);
		System.out.println("Volume:"+volume);
	}
}
class Area
{
	public static void main(String[] args)
	{
			Scanner sc1= new Scanner(System.in);
		System.out.println("Press 1 for Circle\nPress 2 for Sphere");
		int n=sc1.nextInt();
		
		switch(n)
			{
			case 1:
				{
					Circle c = new Circle();
					c.getInfo();
					c.calc();
					c.display();
					break;
				}
			case 2:
				{
					Sphere s = new Sphere();
					s.getInfo();
					s.calc();
					s.display();
					break;
				}
			}
	}	
}