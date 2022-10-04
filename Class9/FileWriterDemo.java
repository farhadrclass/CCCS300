import java.io.FileWriter;
import java.io.IOException;


public class FileWriterDemo {

	public static void main(String[] args) {
		
		try {
			//	Create File
			FileWriter f = new FileWriter("Output.txt");
			
			// Creating content for the file
			String content = "CCCS 300 is an amazing class";
			
			//	Using the write method to write the content directly to the file
			f.write(content);
			
			//	Print if successfully written
			System.out.println("Successfully written to the file");
			
			// Close the file
			f.close();
		}
		catch(IOException e){
			System.out.println("Error in writing to the file");
		}		
	}
}
