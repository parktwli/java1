//Area of a circle
import java.util.Scanner;
class Circle
	{ public static void main(String[] args)
		{ Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the radius of circle:");
		  int n=sc.nextInt();
		  double ar=(3.14159*n*n);
		  System.out.println("The area of circle is:" + ar);
}
}