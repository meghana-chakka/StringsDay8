package ai.jobiak.strings;

public class TestStrings2 {

	public static void main(String[] args) {
		
		
		//strings can be created in two ways
		//1.as an instance using new,new means we will as constructor
		//2.as a string literal without new
		
		String str= "this too is a string instance";
		System.out.println(str.hashCode());
		String str2="this too is a string instance";
		System.out.println(str2.hashCode());
		
		boolean result=str==str2;
		System.out.println(result);
		
		result=str.equals(str2);
		System.out.println(result);
		
		System.out.println(str.length()==str2.length());
		
		String s1=new String("hello");
		String s2=new String("hello");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//though hashcodes are same they are still unique objects
		
	}

}
