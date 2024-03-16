import java.util.*;
class Student
	{
		public static void main(String[] args)
		{
			int n,hi=0,i;
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the no of students:");
			n=sc.nextInt();
			int a[][]=new int[n][6];
			for(i=0;i<n;i++)
			{
				System.out.print("Enter the roll no and marks in 4 subjects:");
				a[i][0]=sc.nextInt();
				a[i][1]=sc.nextInt();
				a[i][2]=sc.nextInt();
				a[i][3]=sc.nextInt();
				a[i][4]=sc.nextInt();
				a[i][5]=a[i][1]+a[i][2]+a[i][3]+a[i][4];
				if(i==0)hi=0;
				else if(a[i][5]>a[hi][5])
				hi=i;
			}
			System.out.println("Rollno\t  Subject1\t  Subject2\t  Subject3\t  Subject4\t   Total");
			for(i=0;i<n;i++)
			{
				System.out.println(a[i][0]+ "\t\t" +a[i][1]+ "\t\t" +a[i][2]+ "\t\t" +a[i][3]+ "\t\t" +a[i][4]+ "\t\t" +a[i][5]);
			}
			System.out.println("The roll no with Highest total marks is "+a[hi][0]); 
			
		}
	}