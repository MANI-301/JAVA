import java.util.Scanner;
class One_to_N_EvenNumbers
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Any Number:");
		int n = sc.nextInt();
		int number = 2;
		while (number<=n)
		{
			System.out.println(number+":It is Even");
			number+=2;
		}
		
		}
	}
