import java.util.*;
class ReverseArray 
{
	public static void main(String[] args) 
	{
		int[]a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		int[]b = solve(a);
		System.out.println(Arrays.toString(b));
	}
	public static int[] solve(int[]a)
	{
		int left = 0,right = a.length-1;
		while (left<right) // 0<4 //1<3
		{
			int temp = a[left]; // temp=1,2
			a[left] = a[right]; // l=5,4
			a[right] = temp;// r=1,2
			left++;//1 --- 2
			right--;//3 --- 2
		}	
		return a;
	}
}
















