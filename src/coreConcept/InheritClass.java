package coreConcept;

public class InheritClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass cls= new ChildClass();
		System.out.println(cls.a);
		cls.show();
		
		
		//Multilevel Inheritance 
		
		SubChild sb= new SubChild();
		sb.showinit();
		System.out.println(sb.c);
		//sb.show();
		//sb.display();
		
		//Hybrid Inheritance 
		
		sb.showinit();
		System.out.println(sb.a);
		

	}

}
