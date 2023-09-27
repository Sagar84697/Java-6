import java.util.Scanner;
public class ClassExcept {

	public static void main(String[] args) {
		try
		{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("enter the value of c: "+ c);
		System.out.println("execution ended");
		}
		catch(Exception e)
		{
			System.out.println("exception is caught");
		}

	}

}
