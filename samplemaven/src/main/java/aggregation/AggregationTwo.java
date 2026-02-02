package aggregation;

public class AggregationTwo {
	String city;
	String state;
	AggregationOne ref;
	public AggregationTwo(String city, String state, AggregationOne ref)
	{
		this.ref=ref;
		this.city= city;
		this.state= state;
	}
	public void display()
	{
		System.out.println(ref.name);
		System.out.println(ref.rollno);
		System.out.println(ref.address);
		System.out.println(city);
		System.out.println(state);
	}

	public static void main(String[] args) {
		AggregationOne obj= new AggregationOne("murshida",28,"kasaragod");
		AggregationTwo obj1 = new AggregationTwo("kasaragod", "kerala",obj);
		obj1.display();
		// TODO Auto-generated method stub

	}

}
