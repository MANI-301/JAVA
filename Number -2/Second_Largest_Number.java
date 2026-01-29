import java.util.Scanner;
class Second_Largest_Number 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a:");
        int a = sc.nextInt();
		System.out.print("Enter b:");
		int b = sc.nextInt();
		System.out.print("Enter c:");
		int c = sc.nextInt();
		
		
		
		if (a>b && a<c || a>c && a<b)
		{
		  System.out.println("A is Second Greater");
		}
		else if (b>a && b<c || b>c && b<a)
		{
			System.out.println("B is Second Greater");
		}
		else 
			System.out.println("C is Second Greater");
	}
}
