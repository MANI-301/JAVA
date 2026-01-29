import java.util.*;
class MergeArray 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int b[] = {6,7,8,9,10};
		int [] res = solve(a,b);
		System.out.println(Arrays.toString(res));
	}
	public static int[] solve(int[]a ,int[]b)
	{
		int []res = new int [a.length+b.length];
		for (int i=0,m=0,n=0;i<res.length;i++ )
		{
			if (m<a.length)
			{
				res[i]=a[m++];
			}
			else if (n<b.length)
			{
				res[i]=b[n++];
			}
		}
		return res;
	}
}
