import java.util.Scanner;
class Conditional_O_E 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Number:");
		int n = sc.nextInt();
		String a = (n%2==0 ? "even" : "odd");
		System.out.println(a);
	}
}
