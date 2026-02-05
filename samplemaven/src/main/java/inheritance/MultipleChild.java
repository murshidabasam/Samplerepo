package inheritance;

public class MultipleChild implements MultipleParentOne, MultipleParentTwo{
	public void display()
	{
		System.out.println("the final result");
	}

	public static void main(String[] args) {
		MultipleChild obj = new MultipleChild();
		obj.sum();
		obj.sub();
		obj.display();
		// TODO Auto-generated method stub

	}

	@Override
	public void sum() {
		System.out.println("The result");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		System.out.println("The subtraction result");
		// TODO Auto-generated method stub
		
	}

}
