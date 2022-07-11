package coreConcept.SuperKeywordConcept;

public class ChildClass extends ParentClass {
	
	int a= 30;
	 
	public void display() {
		
		System.out.println("Child Class");
		System.out.println(a);
		System.out.println(super.a);
		super.display();
		
	
	}

}
