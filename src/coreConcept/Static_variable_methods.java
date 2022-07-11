package coreConcept;

public class Static_variable_methods {
	
	static int a = 10;//Without static it is instace variable and we need to create object for that
	

	static void display() {
		System.out.println("Static method");
		
	}
	static{
		
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		display();
		
		
		

	}

}
