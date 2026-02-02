package inheritance;

public class MultiLevelChild extends MultiLevelParent{
	public void display3()
	{
		System.out.println("The child");
	}


	public static void main(String[] args) {
		MultiLevelChild obj = new MultiLevelChild();
		obj.display3();
		obj.display2();
		obj.display1();
				
	}

}
