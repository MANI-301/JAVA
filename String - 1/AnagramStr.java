import java.util.*;
class AnagramStr
{
	static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter Character:");
		String s1 = sc.nextLine();
		System.out.print("Enter Character:");
		String s2 = sc.nextLine();
		
		String s = pangram(s1,s2);
		System.out.println(s);
		}
	public static String pangram(String s1,String s2){
		s1 = upperCase(s1);
		s2 = upperCase(s2);
		
		char[]a = charArray(s1);
		char[]b = charArray(s2);
		
		a = sort(a);
		b = sort(b);
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i]){
				return "Not Anagram";
			}
		}
		return "Anagram";
	}
	   
		public static String upperCase(String s){
			 String s1 = "";
             for (int i=0;i<s.length();i++)
             {
				 char ch1 = s.charAt(i);
				 if (ch1>='a' && ch1<='z')
				 {
					  s1 += (char) (ch1-32); 
				 }
				 else
					 s1 += ch1;				 
             }
			 return s1;
		}
		
		public static char[] charArray(String s){
			char []a = new char[s.length()];
			for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			a[i]= ch; 
			}
			return a;
		}
		
		public static char[] sort(char[]a){
		   for (int i=0;i<a.length-1;i++)
		   {
			   for (int j=0;j<a.length-i-1 ;j++)
			   {
			   
			   if(a[j]>a[j+1])
			   {
				   char temp = a[j];
				   a[j] = a[j+1];
				   a[j+1] = temp;
			   }
			   }
		   }
		   return a;
		   
		}
		
		
		
	
}
