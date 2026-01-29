import java.util.*;
class Swap 
{
	static Scanner s =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("\t\t\t\t\t enter you input:");
		int a = s.nextInt();
		System.out.print("\t\t\t\t\t enter you input:");
		int b = s.nextInt();
		System.out.println("Before Swap:" + a);
		System.out.println("Before Swap:" + b);
		
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap A:" + a);
		System.out.println("After Swap B:" + b);
		
		
		
		System.out.print("\t\t\t\t\t enter you input:");
		int c = s.nextInt();
		System.out.print("\t\t\t\t\t enter you input:");
		int d = s.nextInt();
		System.out.println("Before Swap C:" + c);
		System.out.println("Before Swap D:" + d);
		
		
		c=c+d;
		d = c-d;
		c = c - d;
		
		System.out.println("After Swap:" + c);
		System.out.println("After Swap:" + d);
		
		
		
		
	}
}
