import java.util.Scanner;
class Naturals 
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Any Number:");
		int n = sc.nextInt();
		int number =  1;
		while (number<n)
		{
			System.out.println(number);
			number++;
			
		}
	}
}
