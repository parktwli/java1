import java.util.*;
class Jagged
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][];
		int i,j,k=1;
		for(i=0;i<=4;i++)
		{
			a[i]=new int[i+1];
			for(j=0;j<=i;j++)
			{
				a[i][j]=k++;
			}
		}
		System.out.println("Array contains:");
		for(i=0;i<=4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}