
import java.util.Scanner;
class Demo

{
	void div() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("div has started");
		try
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a/b;
		}
		catch(Exception e)
		{
		System.out.println("exception caught");
		throw e;
		}
		finally {
		System.out.println("div has ended");
		}
	}
}
public class ThrowsE {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
		Demo d=new Demo();
		d.div();
		}
		catch(Exception e)
		{
		System.out.println("main method ended");
		}
	}

}
