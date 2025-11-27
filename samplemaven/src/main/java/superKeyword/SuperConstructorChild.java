package superKeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj =new SuperConstructorChild();
		
	}

	
	public SuperConstructorChild() {
		
		super();
		System.out.println("Super Constructor child");
	}
}
