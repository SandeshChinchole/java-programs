import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCode {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \nViolets are blue");
			writer.append("\nA poem by me");
			writer.close();
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
	}
}
