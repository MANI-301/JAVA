import java.util.*;
class FindLargestArray 
{
	public static void main(String[] args) 
	{
		int []a = {8,4,7,8,4,82,35,5};
		
		int res = solve(a);
		
		System.out.println(res);
	}
	public static int solve(int[]a)
	{
		int max = a[0];
		for (int i=1;i<a.length;i++)
		{
			if (max<a[i])
			{
				max = a[i];
			}
			
		}
		return max;
	}
}
