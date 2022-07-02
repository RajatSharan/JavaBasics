package JavaBasics;

public class CoreJavaBasics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object //String Literal :Both values are same then one object will be created 
		
		String s="Rajat Sharan";
		String s1= "Rajat Sharan"; // In backend Java side only one Object will be created 
		
		
		
		//New
		
		String s2= new String("Hello World"); //Two object will be created because we created a string with new keyword 
		String s3= new String("Hello World");
		
		String s5= "Rajat Sharan Academy";
		String[] n=s5.split("Sharan");
		System.out.println(n[0]);
		System.out.println(n[1].trim());
		for (int i=s5.length()-1 ; i>=0;i--) {
			
			System.out.println(s5.charAt(i)); //Reverse String questions
			
		}
	 
	 
		
		

	}

}
