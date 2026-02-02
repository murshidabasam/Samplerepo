package superkeyword;

public class SuperVariableChild extends SuperVariable{
	
	int a =17;
	public void display()
	{
		System.out.println(super.a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		SuperVariableChild obj = new SuperVariableChild();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
