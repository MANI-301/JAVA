import java.util.*;
class Merge 
{
	public static void main(String[] args) 
	{
		int [] a = {10,20,30,40,50};
		int [] b = {60,70,80,90,100};
		int [] res = solve(a,b);
		System.out.println(Arrays.toString(res));
	}
	public static int[] solve (int[]a,int[]b)
	{
		int [] res = new int[a.length + b.length];
		for (int i=0;i<a.length;i++)
		{ 
			res[i]=a[i]; 
		}
			for (int j=0;j<b.length ;j++ )
			{
				res[a.length+j] = b[j];
			}
		return res;
	}
}
