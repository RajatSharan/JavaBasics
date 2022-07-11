package coreConcept;

public class MethodOverloading {
	
	public void display() {
		
		
		System.out.println("Display");
	}
	public void display(int a) {
		
		
		System.out.println("a :"  + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading mn = new MethodOverloading();
		mn.display();
		mn.display(5);
		
		
	}

}
