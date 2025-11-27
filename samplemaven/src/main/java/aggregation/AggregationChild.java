package aggregation;

public class AggregationChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AggregationParent obj=new AggregationParent("Krishna",31,"Venpakal");
				
				AggregationChild obj1=new AggregationChild("tvm","Kerala",obj);
				obj1.display();
	}
	
	String city;
	String State;
	AggregationParent ref;
	
public	AggregationChild(String city, String State,AggregationParent ref )
{
	this.city=city;
	this.State=State;
	this.ref =ref;
}

public void display()
{
	System.out.println("Name : "+ref.name);
	System.out.println("rollno : "+ref.rollno);
	System.out.println("address : "+ref.address);
	System.out.println("city : "+city);
	System.out.println("State : "+State);
}
}
