import java.util.Scanner;
class 2ndLargestofthreenumbers 
{
	static Scanner mani = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("/t /t /t Enter Any Number:");
		int a = mani.nextInt();
		System.out.print("/t /t /t Enter Any Number:");
		int b = mani.nextInt();
		System.out.print("/t /t /t Enter Any Number:");
		int c = mani.nextInt();
		
		if (a>b && a>c)
			System.out.println("A is Greater");
		else if (b>c)
			System.out.println("B is Greater");
		else 
			System.out.println("C is Greater");
	}	
			}
