import java.util.Scanner;
class N_to_1_OddNumbers
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Any Number:");
		int n = sc.nextInt();
		int number = 1;
		while (number<=n)
		{
			System.out.println(number+":It is Odd");
			number+=2;
			
		}
		
		}
	}
