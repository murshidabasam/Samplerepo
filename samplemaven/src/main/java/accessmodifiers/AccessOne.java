package accessmodifiers;

public class AccessOne {
	public void display()
	{
		System.out.println("DISPLAY public");
	}
	private void display1()
	{
		System.out.println("DISPLAY private");
	}
	protected void display2()
	{
		System.out.println("DISPLAY2 protected");
	}
	void display3()
	{
		System.out.println("DISPLAY default ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessOne obj = new AccessOne();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();

	}

}
