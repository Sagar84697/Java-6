class Static
{
	static int x=10;
	static void display()
	{
		System.out.println(x);
	}
	static
	{
		System.out.println("static block");
	}
}
public class Statics {

	public static void main(String[] args) {
		System.out.println(Static.x);
		Static.display();

	}

}
