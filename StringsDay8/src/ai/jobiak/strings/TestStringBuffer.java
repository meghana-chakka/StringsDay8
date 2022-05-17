package ai.jobiak.strings;

public class TestStringBuffer {

	public static void main(String[] args) {
		
		//Strings are immutable
		//StringBuffer buffer = new StringBuffer("Jobiak.ai");
		StringBuffer buffer = new StringBuffer(250);
		
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		buffer.append("@vizag");//at the end
		buffer.insert(0,"@vijayawada");//insert anywhere
		
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		buffer.replace(0,"@vijayawada".length(),"@hyderabad");
		
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		buffer.delete(0,"@hyderabad".length());

		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		buffer.trimToSize();
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		System.out.println(buffer.reverse());
		
		
		
		
		
		
		
	
	
	
	
	}

}
