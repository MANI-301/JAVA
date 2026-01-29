import java.util.Scanner;
class Hotel
{
	static Scanner Sc = new Scanner(System.in);
	public static void main(String [] args) throws Exception
	{
		System.out.println("\t\t\t\tselect the Hotel");
		System.out.println("\t\t\t\t---------------------------");
		System.out.println("\t\t\t\t1.Buhari");
		System.out.println("\t\t\t\t2.A2B");
		System.out.println("_______________________________________________________________________________________________________________________________________");
		System.out.print("\t\t\t\tSelect Hotel Which you Want:");
		int a = Sc.nextInt();
		System.out.println("\t\t\t\tProcessing.....");
		Thread.sleep(2000);
		
		switch (a)
		{
	case 1:
			{
				System.out.println("You Selected Buhari");
				System.out.println("----------------------");
				System.out.println("Menu Card:");
				System.out.println("1.Chicken Briyani");
				System.out.println("2.Mutton Briyani");
				System.out.println("_______________________________________________________________________________________________________________________________");
				System.out.print("\t\t\t\tSelect Menu:");
				int b = Sc.nextInt();
				System.out.println("\t\t\t\tProcessing....");
				Thread.sleep(3000);
				
		  switch (b)
		  {
		  case 1:
			  {
				System.out.println("Chicken Briyani Price=350");
				break;
			  }
		  case 2:
			  {
				System.out.println("Mutton Briyani Price=480");
				break;
			  }
		  default :
			  {
				System.out.println("Invalid Selection");
				break;
			  }
		  }
		  break;
		  }
		  
	case 2:
			{
				System.out.println("You Selected A2B");
				System.out.println("----------------------");
				System.out.println("Menu Card:");
				System.out.println("1.Dosa");
				System.out.println("2.Idli");
				System.out.println("_______________________________________________________________________________________________________________________________");
				System.out.print("\t\t\t\tSelect Menu:");
				int c = Sc.nextInt();
				System.out.println("\t\t\t\tProcessing....");
				Thread.sleep(3000);
				
		  switch (c)
		  {
		  case 1:
			  {
				System.out.println("Dosa Price=100");
				break;
			  }
		  case 2:
			  {
				System.out.println("Idli Price=50");
				break;
			  }
		  default :
			  {
				System.out.println("Invalid Selection");
			  break;
			  }
			  
			  }
			break;
			}
			  
			  
		  default :
			  {
				System.out.println("Wrong Selection");
			  }
		  }
		}
			}

		