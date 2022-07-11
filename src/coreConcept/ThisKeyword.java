package coreConcept;

public class ThisKeyword {
	
	int a=10; //Instance variable
	
	public void show() {
	
	int a=20; //(local variable)
	
	
      System.out.println("Local Variable :"+ a);
      System.out.println("Instance Variable :" +this.a);// Calling instance variable

}
	

public static void main(String[]args) {
	
	ThisKeyword th = new ThisKeyword();
	th.show();

	
	
}

}