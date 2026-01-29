class  Test3
{
	public static void main(String[] args) 
	{
		int age = 27;
		boolean student = false;
		boolean adult = age >= 18 && age <=30 && !student;
		System.out.println("he is eligible: " + adult);
	}
}
