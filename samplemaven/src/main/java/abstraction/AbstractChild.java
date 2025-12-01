package abstraction;

public class AbstractChild extends AbstractParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj = new AbstractChild();
		obj.display();
		obj.print();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}

}
