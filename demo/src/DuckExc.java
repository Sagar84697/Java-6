import java.util.Scanner;

class Demo1
{
	void div() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("div has started");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a/b;
		System.out.println("exception caught");
		System.out.println("div has ended");
		}
}

public class DuckExc {

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


