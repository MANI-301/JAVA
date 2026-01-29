import java.util.Scanner;
class Factorial
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Any Number:");
		int n = sc.nextInt();
		int Fact = 1;
		for (int i=1;i<=n;i++)
		{
			Fact = Fact*i;
		}
		System.out.println(Fact);
	}
}
