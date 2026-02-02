package inheritance;

public class HeirarcialChild1 extends HeirarcialParent{
	public void display()
	{
		System.out.println("The display is here");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeirarcialChild1 obj = new HeirarcialChild1();
		obj.sum(10, 32);
		obj.display();

	}
}