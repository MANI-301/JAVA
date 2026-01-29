class M5 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Start");
		if (mani(12345))
		{
			System.out.println("chennai");
		}
		else
			System.out.println("Mumbai");
	}
		public static boolean mani(int a)
	{
		if (a%2==0)
		{
			return false;
		}
			return mani1(a);
	}
	public static boolean mani1(int a)
	{
		if (a<100000000)
		
			return true;
		return false;
	}
}
