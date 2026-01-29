import java.util.Scanner;
class Largest_2_Number
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a:");
		int a =sc.nextInt();
		System.out.print("Enter b:");
		int b = sc.nextInt();
		if (a>b)
		{
			System.out.println("A is Greater");
		}
			else 
				System.out.println("B is Greater");
		
	}
}
