import java.util.Scanner;
class Factors
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Num:");
		int n = sc.nextInt();
		int temp = n;
		for (int i=1;i<=n;i++)
		{
			if (temp%i==0)
			{
				System.out.println(i);
			}
		}
		
		
	}
}
