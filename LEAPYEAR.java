import java.util.Scanner;


public class LEAPYEAR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
Scanner sc=new Scanner(System.in);
System.out.println("enter the year :::");
year=sc.nextInt();
sc.close();
if(year%4==0)
{
	if(year%100==0)
		{
		 if(year%400==0)
		 {
			System.out.println("leap year 1") ;
		 }
		 else
		 {
			 System.out.println("not leap1");
			
		 }


	}
	else
	{
		System.out.println("leap year 2");
	}
	

}else
{
	System.out.println("not leap 3");
}

	
}
}



