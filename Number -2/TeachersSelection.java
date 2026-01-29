import java.util.Scanner; 
class TeachersSelection
{ 
static Scanner sc=new Scanner(System.in); 
public static void main(String[] args) 
{ 
System.out.println("Select the Class"); 
System.out.println("-------------------------------------"); 
System.out.println("1.11th std\n2.12th std"); 
System.out.print("\t\t\tSelect your Coice:"); 
int std=sc.nextInt();//-1 or 2 or Invalid Input 
switch (std) 
{ 
case 1:{ 
System.out.println("You are in 11th Std"); 
System.out.println("Select 11th class Teachers"); 
System.out.println("---------------------------------------"); 
System.out.println("1.Ram"); 
System.out.println("2.Sita");
System.out.print("\t\t\tSelect Your Choice:");
int teachers_selection=sc.nextInt(); 
switch (teachers_selection) 
{ 
case 1:{ 
System.out.println("\t\t\tRam Sir Takes Maths Subject"); 
break;}//Ram 
case 2:{ 
System.out.println("\t\t\tSita Mam Takes Physics Subject"); 
break; }//Sita 
default:{ 
System.out.println("Invalid 11th cls Teacher Selection"); break;}//Invalid 11th cls Teacher Selection 
} 
break; }//11th std 
case 2:{ 
System.out.println("\t\t\tYou are in 12th Std");
System.out.println("Select 12th Class teachers");
System.out.println("------------------------------------------");
System.out.println("1.Mani");
System.out.println("2.Divya");
System.out.print("\t\t\tSelect Your Choice:");
int teacher_selection1 = sc.nextInt();

switch (teacher_selection1)
{
case 1:{ 
	        System.out.println("\t\t\tMani Sir Takes Chemistry");
	break;
		}
case 2:{
	        System.out.println("\t\t\tDivya Mam Takes Biology"); 
    break;
}
default:{ 
	System.out.println("Invalid 12th Class Selection");
	break;}//12th std;
}
break;
}
default : { 
System.out.println("\t\t\tInvalid Class Selection"); break; } 
} 
}
}