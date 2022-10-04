import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class BufferWriterDemo {

	public static void main(String[] args) {
		
		try {
			//	Create File
			FileWriter f = new FileWriter("Output\\Output_4.txt");
			
//			FileWriter f = new FileWriter("C:\\Users\\mushf\\OneDrive - McGill University\\Eclipse Workspaces\\eclipse-workspace\\CCCS_Module_9\\Output\\Output_3.txt");
			
			BufferedWriter b =  new BufferedWriter(f);
			
			// Creating content for the file
			String content = "CCCS 300 is an amazing class";
			
			//	Using the write method to write the content directly to the file
			b.write(content);
			
			//	Print if successfully written
			System.out.println("Successfully written to the file");
			
			// Close the buffer
			b.close();
			
			// Close the file
			f.close();
		}
		catch(IOException e){
			System.out.println("Error in writing to the file");
		}
	}

}
