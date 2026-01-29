import java.util.*;
class BinaryToDecimal 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Any Number:");
	    int n = sc.nextInt(); 
        int x=1,sum=0;
		while (n>0)
		{
			sum = sum+n%10*x;
			x*=2;
			n/=10; 
		}
		System.out.println(sum);
			
	}
}

/*import java.util.*;
class BinaryToDecimal
{
static Scanner sc=new Scanner (System.in);
public static void main (String[]args)
	{System.out.print("enter the binary : ");//10011    2^0=1 2^1=2 2^2=4 2^3=8 2^4=16 
		int a =sc.nextInt();
		int b=0,p=1,sum=0;
		while (a>0)
		{b=a%10;
		sum+=b*p;
		a=a/10;
		p+=p;
		}System.out.print(sum);
	}
}*/