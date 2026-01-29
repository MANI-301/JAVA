import java.util.Scanner;
class Third_Largest_Number 
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
		System.out.print("Enter d:");
		int d = sc.nextInt();
		
		
		
		
		if (a>b && a<c && a<d || a>c && a<b && a<d || a>d && a<b && a<c )
		{
		  System.out.println("A is Third Greater");
		}
		else if (b>a && b<c && b<d || b>c && b<a && b<d || b>d && b<a && b<c)
		{
			System.out.println("B is Third Greater");
		}
		else if (c>a && c<b && c<d || c>b && c<a && c<d || c>d && c<a && c<b)
		{
			System.out.println("C is Third greater");
		}
		else 
			System.out.println("D is Third Greater");
	}
}
