import java.util.*;
class deciamalToBinary 
{	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Number:");
		 int num = sc.nextInt();
	     String rem = "";
		 while (num>0)
		 {
			 rem = rem+num%2;
			 num /=2;
		 }
	}
}
