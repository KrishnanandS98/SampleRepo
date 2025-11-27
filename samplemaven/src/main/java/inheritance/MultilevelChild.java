package inheritance;

public class MultilevelChild extends MultilevelParent{

	public void print()
	{
		
		System.out.println("child");
	}

	
public static void main(String[] args) {
		
		MultilevelChild obj=new MultilevelChild();
		obj.show();
		obj.display();
		obj.print();
		
	}

}
