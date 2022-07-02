package JavaBasics;

public class CoreJavaBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array2= {1,2,3,4,5,6,8,9,10,100,200};
		
		//Check if array is multiple of 2
		
		for(int i=0; i<array2.length;i++) 
		
		{
			if(array2[i]%2==0) 
			{
				System.out.println(array2[i]);
			}
			else
			{
				System.out.println(array2[i] + " Is not multiple of two " );
			}
			
		}
		
		
	}

}
