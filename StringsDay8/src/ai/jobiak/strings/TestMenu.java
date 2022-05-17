package ai.jobiak.strings;

import java.util.*;
public class TestMenu {

	public static void main(String[] args) {
		
		String action ="stop";
		String choice= "continue";
		//!choice.equals(action);
		while(true)
		{
			System.out.println("Enter a choice");
			Scanner scanner = new Scanner(System.in);
			int option =scanner.nextInt();
			switch(option) {
			
			case 1:{
				System.out.println("case 1");
				break;
			   }
			}
		}
		
	}

}
