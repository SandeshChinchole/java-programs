import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		
		File file = new File("secret_message.rtf");
		
		if(file.exists()) {
			
			System.out.println("The file exists :)");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
		}
		else {
			
			System.out.println("The file does not exist :(");
		}
	}
}
