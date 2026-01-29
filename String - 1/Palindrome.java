import java.util.*;
class Palindrome 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter String:");
		String n  = sc.nextLine();
	    String rev = "";
		for (int i =n.length()-1;i>=0;i--)
		{
			rev+=n.charAt(i); 
		}
		if (n.equals(rev))
		{
			System.out.println("It is a Palindrome");
		}
		else 
			System.out.println("It is Not a Palindrome");
	}
}
