package Sample;

import java.util.Scanner;

public class StringVariables {
	Scanner sc = new Scanner(System.in);
	public static void changeCase() {
		String changeCase = "Text to change";
		System.out.println(changeCase);
		
		String result;
		result = changeCase.toUpperCase();
		
		System.out.println(result);
	}

}
