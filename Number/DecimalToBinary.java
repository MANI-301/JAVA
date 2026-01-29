import java.util.*;
class DecimalToBinary 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Any Number:");
	    int n = sc.nextInt(); 
        String rem = " " ;
		while (n>0)
		{
			rem = rem+n%2; // ""+13%2=""+1 = 1 ----> 1+6%2=1+0 =10 -----> 10+3%2 = 10+1  = 101 -----> 101+1%2=101+1 = 1011 ;
			n/=2; // 13/2=6 ----> 6/2=3-----> 3/2=1 ------> 1/2 = 0;
				
			 
		}
		System.out.println(rem);
			
	}
}
