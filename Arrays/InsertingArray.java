import java.util.*;
class InsertingArray 
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Array Size:");
		int size = sc.nextInt();
		int[]a = new int[size];
		solve(a);
	}
	public static void solve(int[]x)
	{
		for (int i=0;i<x.length;i++)
		{
			System.out.print("Enter Array Element:");
			x[i] = sc.nextInt();
		}
		for (int i=0;i<x.length ;i++ )
		{
			System.out.print(x[i]+" ");
		}
	}
}
