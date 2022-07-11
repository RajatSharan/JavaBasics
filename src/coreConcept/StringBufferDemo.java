package coreConcept;

public class StringBufferDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer stringbuffer= new StringBuffer("Happy");
		System.out.println(stringbuffer);
		/*
		 * System.out.println(stringbuffer.append("HI"));
		 * System.out.println(stringbuffer.delete(0,2));
		 */
		System.out.println(stringbuffer.reverse());
		System.out.println(stringbuffer.charAt(3));
		System.out.println(stringbuffer.substring(4));
		System.out.println(stringbuffer.subSequence(2,2));
	}

}
