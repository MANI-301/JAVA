import java.util.Scanner;
class Factors 
{
    static int n1=0,n2=1;
	static Scanner sc =new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Num:");
		int num = sc.nextInt();
		
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		factor(num);
	}
	public static void factor(int a)
	{   
		int n3=0;
		if (a>0)
		{
		  n3=n1+n2;
		  n1=n2;
		  n2=n3;
		  System.out.print(n3+" ");
		  a--;
		  factor(a);
		}	
	}
	}
