
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodDemo m= new MethodDemo();//If we want to access own class object then we need to create object
		
		String name = m.getData();
		System.out.println(name);
		MethodDemo2 d=new MethodDemo2();
		d.getuserData();
		getData2();
		

	}

	public String getData() {
		
		System.out.println("Hello World");
		return "Rajat Sharan";
		
	}
	
	public static String getData2() {
		
		System.out.println("TEST CHECK");
		return "Static Method";
		
	}
	
	
	
}
