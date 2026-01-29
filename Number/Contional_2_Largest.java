import java.util.Scanner;
class Contional_2_Largest 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.print("\t\t\t Enter A:");
		int A = sc.nextInt();
		System.out.print("\t\t\t Enter B:");
		int B = sc.nextInt();
		System.out.println("\t\t\t\t Processing......");
		Thread.sleep(2000);
		String n = (A>B ? "\t\t\t\t\t\t\t A is Greater"  : "\t\t\t\t\t\t\t B is Greater");
		System.out.println(n);
	}
}
