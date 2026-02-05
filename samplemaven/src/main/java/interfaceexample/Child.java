package interfaceexample;

public class Child implements Parent{
	public void show()
	{
		System.out.println("This is the child class");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.print();
		obj.show();
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		System.out.println("Here is the plcae to print");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("Display");
		// TODO Auto-generated method stub
		
	}

}
