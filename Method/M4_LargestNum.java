import java.util.Scanner;
class M4_LargeNum 
{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{
		boolean a = largest();
		System.out.println(a + " A is Greater");
	}
	public static boolean largest()
	{
		System.out.print("Enter a:");
		int a = sc.nextInt();
		System.out.print("Enter b:");
		int b = sc.nextInt();
		 if (a>b)
		 {
			 System.out.println("A is greater");
		 return true;
		 }
			 else
				 System.out.println("B is greater");
			return false;
	}
}
