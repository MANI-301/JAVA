class Substring 
{
	public static void main(String[] args) 
	{
		String a = "abcd";
		for (int i=0;i<a.length();i++)
		{
			for (int j=1;j<=a.length();j++)
			{
				if (i<=j)
				{
					System.out.print(" "+a.substring(i,j));
				}
				
			}
			System.out.println();
			
		}
	}
}
