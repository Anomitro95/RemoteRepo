import java.util.*
class HelloWorld
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.prinltn("Enter number of times you need printing :");
		int n=sc.nextInt();
		for(int i=1; i<n; i++)
		System.out.println("Hello Git World");
	}
}