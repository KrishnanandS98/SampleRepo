package superKeyword;

public class SuperMethodChild extends SuperMethodParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj =new SuperMethodChild();
		obj.display();
		
		
		
	}
	public void display()
	{
		System.out.println("Super Method Child");
		super.print();
	}
}
