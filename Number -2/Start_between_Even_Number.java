import java.util.Scanner;
class Start_between_Even_Number 
{
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) 
	{
		System.out.println("Enter Starting Number:");
		int Start = sc.nextInt();
		System.out.println("Enter Ending Number:");
        int End = sc.nextInt();
		int temp = Start,temp1=End; 
		while (Start<=End)
		{
			if (temp == Start && temp1 == End)
			{
				Start++;
				End--;
			}
			if (Start%2==0)
			{
				System.out.println("The InBetween Number is:"+Start);
			}
			Start++;
		}
	}
}
