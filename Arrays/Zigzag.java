import java.util.*;
class Zigzag 
{
	public static int[] solve(int[]a,int[]b)
	{
		int []r = new int[a.length+b.length];
		for (int i=0;i<r.length;i++ )
		{
			r[i]=a[i];
			for (int j=0;j<r.length;j++ )
			{
				r[i] = b[i];
				break;
			}
		}
		return r;
	}
	public static void main(String[] args) 
	{
		int []a ={10,20,30,40};
		int []b = {50,60,70,80};
		int [] res = solve(a,b);
		System.out.println(Arrays.toString(res));
	}
}
