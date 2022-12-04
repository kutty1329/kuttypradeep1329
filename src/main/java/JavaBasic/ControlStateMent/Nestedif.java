package JavaBasic.ControlStateMent;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		if(a<b)
		{
			if(a>b)
			{
				System.out.println("Loop Start check");
			}
			if(b>c)
			{
				System.out.println("Loop start next");
			}
			if(c>a)
			{
				System.out.println("Loop closeFinal");
			}
			else
				System.out.println("Exit");
		}
		else
			System.out.println("Thank You");

	}

}
