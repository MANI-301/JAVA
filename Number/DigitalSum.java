import java.util.*;
class DigitalSum // We need sum the digits or add the digits
{
	static Scanner sc =new Scanner(System.in);
	public static void main (String [] args)
	{
		System.out.print("Enter Any Number:");
		int n = sc.nextInt(); // storing the input
		int sum =0; // we  need  container sum the digits
		while (n>0) // if n>0 why means after remove all the digits we are getting as 0
		{
			sum += n%10; // sum =0+55%10 = 0+5=5 ------> =5+5=55
				n/=10; // n= 55/10=5 ------>  =5/10=0
		}
		System.out.println(sum);
		
	}	
}

