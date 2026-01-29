import java.util.*;
class Anagram 
{
	public static void main(String[] args) 
	{
		String s1 = "silent";
		String s2 = "listen";
		System.out.println(anagram(s1,s2));
	}
	public static boolean anagram(String s1,String s2)
	{
		
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		char[]a = s1.toCharArray();
		char[]b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		s1 = new String(a);
		s2 = new String(b);
		
		return s1.equals(s2);
		
		
		
		/*
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<b.length;j++)
			{
				if (i==j)
				{
					return true;
				}
			}
		}return false;
		*/
		
	}
}