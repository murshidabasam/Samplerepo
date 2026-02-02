package accessmodifiers;

public class AccessFour {
	public void dis()
	{
		System.out.println("this is the first display iwth public");
	}
	private void dis1()
	{
		System.out.println("this is the first display iwth private");
	}
	protected void dis2()
	{
		System.out.println("this is the first display iwth protected");
	}
     void dis3()
	{
		System.out.println("this is the first display iwth default");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessFour obj = new AccessFour();
		obj.dis();
		obj.dis1();
		obj.dis2();
		obj.dis3();

	}

}
