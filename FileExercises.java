package Sample;
import java.io.*;
import java.util.Scanner;

public class FileExercises {
	public static void main(String[] args) throws IOException{
		File fileObj = new File("C:\\Users\\Administrator\\Downloads\\FileFolder\\NewFile.txt");
		try {
			if(fileObj.createNewFile()) {
				System.out.println("NewFile Created!");
				
			}
			else {
				System.out.println("Already exists");
			}
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		//Method - 1 Write file
		FileWriter fWrite = new FileWriter("C:\\\\Users\\\\Administrator\\\\Downloads\\\\FileFolder\\\\NewFile.txt");
		fWrite.append("Java has a content now!");
		fWrite.close();
		
		// Check if it an read/write/get path
		System.out.println(fileObj1.canRead());
		System.out.println(fileObj1.canWrite());
		System.out.println(fileObj1.getAbsolutePath());
		System.out.println(fileObj1.length());
		
		//Method - 2 Writing into File Dynamically
		try {
		File filObj = new File("C:\\Users\\Administrator\\Downloads\\FileFolder\\NewFile.txt");
		System.out.println("Enter the file content:");
		Scanner scanInput = new Scanner(System.in);
		String data = "";
		while(scanInput.hasNextLine()) {
			data = scanInput.nextLine();
			System.out.println("File Content:" + data);
		}
		fileObj.write(data);
		fileObj.close();		
		} catch (Exception ex) {
		ex.printStackTrace();
		
		// Method 2 - 
		// Method 3 - BufferedWriter using Offset
		Scanner sc1 = new Scanner(System.in);
		FileWriter file1 = new FileWriter("C:\\Users\\Administrator\\Downloads\\FileFolder\\NewFile.txt");
		String data1 = "";
		BufferedWriter bf1 = null;
		try {
			System.out.println("Enter the content:");
			data1 = sc1.nextLine();
			System.out.println("Enter the offset:");
			int offset = sc1.nextInt();
			bf1 = new BufferedWriter(file1);
			bf1.write(data1, offset, data1.length() - offset);
			// bf.write(data, 0, data.length());
			} catch (IOException e) {
				e.printStackTrace();
			}
			bf.close();
			sc.close();
		
		}
	}
}

