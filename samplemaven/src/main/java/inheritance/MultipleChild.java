package inheritance;

public class MultipleChild implements MultipleParent1,MultipleParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChild obj =new MultipleChild();
		obj.display();
		obj.print();
		obj.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritance method from parent1");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritance method from parent1");
	}

	public void print() {
		
		System.out.println("Multiple inheritance method from child");
	}
}
