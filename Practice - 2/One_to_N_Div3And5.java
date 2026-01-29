import java.util.Scanner;
class One_to_N_Div3And5
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Any Number:");
		int n = sc.nextInt();
		int number = 1;
		while (number<=n)
		{
			if (number%3==0 && number%5==0)
			{
				System.out.println(number+":IT is divisble by 3 and 5");
			}
			number++;
			
		}
		
		}
	}
