import java.util.Arrays;
class RotateArray 
{
	public static void main(String[] args) 
	{
		int key=3;
		int[]a ={10,20,30,40,50};
		for (int i=1;i<=key;i++)
		{
			int first = a[0];
			for (int j=0;j<a.length-1;j++ )
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		System.out.println(Arrays.toString(a));
	}
}
