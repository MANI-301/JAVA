import java.util.*;
class StrongNumber  
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Num:");
		int n = sc.nextInt();
		int temp = n,sum=0,last=0;
		
		
		while (n>0)
		{
			int fact=1;
			last=n%10;
				for (int i=1;i<=last;i++)
				{
				  fact*=i;
				}
				sum+=fact;
				n/=10;
		}
		if (sum==temp)
		{
			System.out.println("It is a Strong Number");	
		}
		else 
			System.out.println("It is Not a Strong Number");
	}
}
