package inheritance;

public class HierarchialChildA extends HierarchialParent {
	
	public void print()
	{
		
		System.out.println("child A");
	}

	public static void main(String[] args) {
		
		HierarchialChildA obj1 =new HierarchialChildA();
		obj1.sum();
		obj1.print();
	}

}
