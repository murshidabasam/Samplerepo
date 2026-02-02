package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	public void print()
	{
		super.print();
		System.out.println("The printing statement");
	}

	public static void main(String[] args) {
		
		SuperMethodChild obj = new SuperMethodChild();
		obj.print();
		// TODO Auto-generated method stub
		

	}

}
