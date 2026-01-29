import java.util.Scanner;
class Vowels 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your Alphabet:");
		char n = sc.next().charAt(0);
		
		if (n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U' && n =='a' || n == 'e' || n == 'i' || n == 'o' || n == 'u')
		{
			System.out.println("It is a Vowel");
		}
		else if (n>0 || n<0 )
			{
			   System.out.println("Wrong Input");
			}
		
		else 
			System.out.println("It is a Consonent");
	}
}
