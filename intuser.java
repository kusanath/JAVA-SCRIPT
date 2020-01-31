import java.util.Scanner;


public class intuser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" first number:::");
		a=sc.nextInt();
		System.out.println("second number:::");
		b=sc.nextInt();
		sum=a+b;
		sc.close();
		System.out.println("sum is :::"+sum);
		
		
		
		

	}

}
