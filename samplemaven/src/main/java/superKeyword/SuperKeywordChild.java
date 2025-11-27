package superKeyword;

public class SuperKeywordChild extends SuperKeywordParent{

	
	String s="Red";
	public void display1() {
		
		System.out.println(s);
		System.out.println(super.s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		SuperKeywordChild obj =new SuperKeywordChild();
		obj.display1();
		
	}

}
