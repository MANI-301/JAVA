import java.util.*;
class Happy 
{
	static Scanner sc = new Scanner (System.in); 
	public static void main(String[] args) 
	{
		System.out.println("Enter Num:");//5
		int n = sc.nextInt();
		
		while (n!=1 && n!=4) //5   25
		{
			int sum=0;
			while (n>0)//5    25
			{
				sum+=n%10*n%10;//25  
				n/=10;
			}
			n=sum;//25 //29
		}
		System.out.println((n==1)?"Happy":"UnHappy");
	}
}
