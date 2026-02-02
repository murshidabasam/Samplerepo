package inheritance;

public class HeirarcialChild2 extends HeirarcialParent{
	public void print(int a, float b)
	{
		float c = a-b;
		System.out.println("The result is" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarcialChild2 obj = new HeirarcialChild2();
		obj.print(10, 2.5f);
		obj.sum(12, 11);

	}

}
