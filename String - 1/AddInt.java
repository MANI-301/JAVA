import java.util.*;
class AddInt 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter String:");
		String s = sc.nextLine();
		int res = add(s);
		System.out.println(res);
	}
	public static int add(String s)
	{
		int sum=0;
		char [] a = s.toCharArray();
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>='0' && a[i]<='9')
			{
				sum+=a[i]-48;
			}
			
		}
		return sum;
	}
}
