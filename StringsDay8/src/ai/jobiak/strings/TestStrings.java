package ai.jobiak.strings;

public class TestStrings {

	public static void main(String[] args) {
		String s=new String();
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s==null?true:false);
		System.out.println(s.hashCode());
		System.out.println(s.toString());
		
		//other string
		
		String str=new String();
		str="\\Jobiak.com Grooming AI";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.hashCode());
		System.out.println(str.toString());
		System.out.println(str.toLowerCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		
		byte bytes[]= {67,76,87,66,77};
		String byteStr=new String(bytes);
		System.out.println(byteStr);
		
		char chars[]= {'I',' ','S','c','r','e','a','m'};	
		String charStr= new String(chars);
		System.out.println(charStr);
		
		String tongueTwister=new String("She sells sea shells on sea shore");
		char letters[]=new char[tongueTwister.length()];
		tongueTwister.getChars(0,tongueTwister.length(),letters,0);
		//tongueTwister.getChars(0, 8, letters, 0);//if we want print the desired no. characters
		
		
		for(char c:letters) {
			System.out.print(c);
		}
		System.out.println();
		String fromChars= new String(letters,10,10);
		System.out.println(fromChars);
		
		String name= new String("My name is John");
		String copyName = new String("My name is John");
		System.out.println("name="+name);
		System.out.println("copyName="+copyName);
		
		
		boolean result=name==copyName;
		System.out.println(result);
		
		result=name.equals(copyName);
		System.out.println(result);
		
		
		
		String eMail = new String("anil4java2@gmail.com");
		String username=eMail.substring(0,eMail.indexOf("2")+1);
		System.out.println(username);
		
		boolean valid =false;
		for(char c:eMail.toCharArray()) {
			if(c=='@'&&c=='.') {
				valid=true;
			}	
		}
		if(valid) {
			System.out.println("you have provided valid username");
			
		}
		else {
			System.out.println("invalid username");
			
		}
		for(int i=0;i<eMail.length();i++) {
			System.out.println(eMail.charAt(i));
		}
		
		
	}

}
