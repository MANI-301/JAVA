import java.util.Scanner;
class XPowerN 
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int x = sc.nextInt();
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int sum = 1;
		for (int i=1;i<=n;i++)
		{
			sum = x*i;
		}
	}
}
