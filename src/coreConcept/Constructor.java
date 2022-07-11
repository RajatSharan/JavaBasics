package coreConcept;

public class Constructor {
	
	String name;
	int rollno;
	
	
	Constructor(){ //Default Constructor
		
		 name="Rajat";
		 rollno=12;
		
	}
	
	Constructor(String str, int rno){ //Parameterize Constructor
		
		name=str;
		rollno=rno;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor s1=new Constructor();
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		Constructor s2=new Constructor("Rajat Sharan",999);
		System.out.println(s2.name);
		System.out.println(s2.rollno);

	}

}
