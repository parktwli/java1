import java.util.Scanner;

public class Time{
	public static void main(String[] args)
		{ Scanner input= new Scanner(System.in);
			System.out.println("Enter the time in sec");
			int time= input.nextInt();
                        
			int min=time/60;
			int sec=time%60;
			System.out.println("The time is "+min+"min and "+sec+"sec");
}

}