 class m1 
{
	
	public static void main(String[]args) throws Exception 
	{
	     String s = "Success";
		for (int i=0;i<s.length()-1;i++)
		{
			int repeat=0;
			for (int j=1;j<s.length();j++)
			{
				
				if ((s.charAt(i) + "").equalsIgnoreCase(s.charAt(j) + ""))
				{
					repeat+=1;
				}
			}
				if (repeat==1){
					System.out.println(s.charAt(i));
				break;
				}
			}
	}}
