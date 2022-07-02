package JavaBasics;
import java.util.ArrayList;

public class Array_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Arrays
		int[] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		
		int [] array2= {1,2,3,4,5,6};
		/*
		 * System.out.println(arr[0]); System.out.println(array2[4]);
		 */
		
		//For Loop
		/*
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * System.out.println(arr[i]);
		 * 
		 * }
		 */

		String []name = {"Rajat","Sharan","Cypress"};
		/*
		 * for(int i=0;i<name.length;i++) {
		 * 
		 * System.out.println(name[i]);
		 * 
		 * }
		 */
		//Enhanced for loop declaration & using Conditional statements inside the loops
		
		for(String s:name) {
			
			System.out.println(s);
			
		}
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("Rajat");
		System.out.println(a.get(0));
		
		
		
		
		
	}

}
