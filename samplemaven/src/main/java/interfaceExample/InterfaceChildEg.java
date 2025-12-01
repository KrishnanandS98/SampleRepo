package interfaceExample;

public class InterfaceChildEg implements InterfaceEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChildEg obj1=new InterfaceChildEg();
		obj1.display();
		obj1.print();
		obj1.show();

	}
	
	public void show()
	{
		
		System.out.println("Interface");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("1st abstract method");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("2nd abstract method");
	}
	

	
	
}
