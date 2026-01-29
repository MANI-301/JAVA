import java.util.*;
class One_To_N
{
	static int count =1;
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter num:");
		int n =sc.nextInt();
		display(n);
	}
		public static void display(int a)
	{
		if (count<=a)
		{
			System.out.println(count);
			count ++;
			display(a);
		}
	}
}
