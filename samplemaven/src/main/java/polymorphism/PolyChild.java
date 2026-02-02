package polymorphism;

public class PolyChild extends PolyParent{
	public void print(int a, int b)
	{
		super.print(11, 5);
		int c= a-b;
		System.out.println("The sub is "+ c);
	}

	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.print(18, 10);
		// TODO Auto-generated method stub

	}

}
