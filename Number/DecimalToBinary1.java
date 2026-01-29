import java.util.*;
class DigitalSum
{
	static Scanner sc =new Scanner(System.in);
	public static void main (String [] args)
	{
		System.out.print("Enter Any Number:");
		int n = sc.nextInt();
		int sum =0;
		while (num>0)
		{
			sum += num%10;
				num/=10;
		}
		System.out.println(sum);
		
	}	
}

