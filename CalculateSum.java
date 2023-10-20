package Sample;

import java.util.Scanner;

public class CalculateSum {
	
	private int value1;
	public int value2;
	protected String name;
	
	public void Calculate() {
	Scanner scanner = new Scanner(System.in);
	// name = scanner.next(); // scanner.nextLine(); as String
	System.out.println("Enter the input");
	
	value1 = scanner.nextInt(); //Getting input as integer
	
	value2 = scanner.nextInt();
	
	System.out.println("Sum:" + value1 + value2);

	}
		
}
