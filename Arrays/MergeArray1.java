import java.util.*;
class MergeArray1
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4};
		int [] b = {5,6,7,8};
		int[]res = solve(a,b);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] solve(int[]a, int[]b)
	{
		int[]c = new int[a.length+b.length];
		for (int i=0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		for (int j=0;j<b.length;j++)
		{
			c[a.length+j] = b[j];
		}
		return c;
	}
}
