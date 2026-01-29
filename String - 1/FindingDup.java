class FindingDup 
{
	public static void main(String[] args) 
	{
		String s = "developer";
		String s1=finddup(s);
		System.out.println(s1);
	}
	public static String finddup(String s);
	{
		String sum = "";
		char []a = s.toCharArray();
		for (int i=0;i<a.length ;i++ )
		{
			if (s[i]==" ")
			{
				continue;
			}
			for (int j=i+1;j<a.length;j++ )
			{
				if (s[i]==s[j])
				{
					
				}
			}
		}
		
	}
}
