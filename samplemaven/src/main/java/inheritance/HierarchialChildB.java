package inheritance;

public class HierarchialChildB extends HierarchialParent {
	
	public void print()
	{
		
		System.out.println("child B");
	}

	public static void main(String[] args) {
		HierarchialChildB obj2=new HierarchialChildB();
		obj2.sum();
		obj2.print();

	}

}
