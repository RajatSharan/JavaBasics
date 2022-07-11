package coreConcept;

public class ConstructorOverloading {
	
	
	ConstructorOverloading(){
		
		System.out.println("Constructor overloading");
		
	}
   ConstructorOverloading(int a){
		
		System.out.println("Constructor overloading" +a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading cons=new ConstructorOverloading();
		ConstructorOverloading cons1=new ConstructorOverloading(5);
		System.out.println(cons);
		System.out.println(cons1);

	}

}
