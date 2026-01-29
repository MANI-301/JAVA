import java.util.*;
class  N_to_1
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Num:");
		int n = sc.nextInt();
	    display(n);
	}
	public static void display(int a)
	{
		if (a>=1)
		{
			System.out.println(a);
			a--;
			display(a);
		}
		}
}
