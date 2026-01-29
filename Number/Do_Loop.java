import java.util.Scanner;
class  Do_Loop
{
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) throws Exception
	{
		boolean a = true;
		do
		{
		System.out.println("Select the input");
		System.out.println("---------------------------");
		System.out.println("1.Father Name");
		System.out.println("2.Mother Name");
		System.out.println("3.Exit");
		System.out.print("\t\t\t\tEnter Your Choice:");
	    int input =sc.nextInt();
		switch (input)
		{
		case 1:{     Thread.sleep(2000);
			         System.out.println("\t\t\t\tMy Father Name is Chandiran");  
			break;}
		case 2:{      Thread.sleep(2000); 
			         System.out.println("\t\t\t\tMy Mother Name is Dharani");
			break;
		}
		case 3: {
			a = false;
			break;
			}
		default :
			Thread.sleep(2000);
			System.out.println("\t\t\t\tInvalid Selection");
		}
		}
		while (a);
		{
			Thread.sleep(2000);
			System.out.println("\t\t\t\tThank You");
		}
		
		
	}
}
