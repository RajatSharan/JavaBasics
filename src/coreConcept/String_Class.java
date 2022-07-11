package coreConcept;

public class String_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is immutable 
		
		String Str= new String(" Hello ");
		String str1= new String(" Rajat ");
		System.out.println(Str.length());//length of the string 
		System.out.println(Str.indexOf("e"));//index value of first character of given string 
		System.out.println(Str.charAt(3));
		String Strn3= Str.concat(str1);
		System.out.println(Strn3);
		System.out.println(Str.toLowerCase());
		System.out.println(Str.toUpperCase());
		System.out.println(Str.trim());
	}

}
