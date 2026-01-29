import java.util.*;
class Removedup
{
	public static void main(String[] args) 
	{
		int[]a= {1,1,2,2,3,4,4,5};
		
		for (int i=0;i<a.length;i++)
		{
			int[]b = new int[a.length];
			int c=a[i];
			for (int j=1;j<a.length;j++)
			{
				if (c[i]!=a[j])
				{
					b[i]=c[i];
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
