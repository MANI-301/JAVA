import java.util.Scanner;
class Remote
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Select the Input");
		System.out.println("-----------------------------");
		Thread.sleep(2000);
		System.out.println(" 1.Power on \n 2.power off \n 3.volume increse \n 4.volume decrease");
		System.out.print("\t\t\t\t\t\tSelect Your Option:");
		int button =sc.nextInt();
		if (button == 1)
		{
			System.out.println("\t\t\t\t\t\tPower on");
		}
		else if (button ==2)
		{
			System.out.println("\t\t\t\t\t\tPower off");
			
		}
		else if (button ==3)
		{
			System.out.println("\t\t\t\t\t\tVolume Increased");
			
		}
		
		else if (button == 4)
		{
			System.out.println("\t\t\t\t\t\tVolume Decreased");
		}
	     else 
			 System.out.println("\t\t\t\t\t\tInvalid");
	}
}
