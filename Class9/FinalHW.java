import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FinalHW {

	public static void main(String[] args) {
		
		//	Writing to the file
		try {
			FileWriter myWriter = new FileWriter("name.txt");
			
			String input = "Jack, Bob, Marie, Farhad";
			
			myWriter.write(input);;
			
			myWriter.close();
			
			System.out.println("Successfully written to the file");
		}
		catch (IOException e) {
			System.out.println("Error in writing to the file");
		}
		
		//	Reading from the file
			try {
				FileReader myReader = new FileReader("name.txt");
				BufferedReader myBufferedReader = new BufferedReader(myReader);
				
				ArrayList<String> outputNames = new ArrayList<>();
								
				String output = myBufferedReader.readLine();
//				System.out.println("output " + output);
				
				myBufferedReader.close();
				myReader.close();
				
				String[] splitedOutput = output.split(", ");
				
				for (int i = 0; i < splitedOutput.length; i++) {
					outputNames.add(splitedOutput[i]);
				}
				
				System.out.println("Elements from the file: " + outputNames);						
				
			}
			catch (IOException e) {
				System.out.println("Error in reading from the file");
			}
	}
}
