package project22;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try
		{
			FileWriter fwrite = new FileWriter(""
					+ "");
			fwrite.write("File handling is going after Read we write in to file");
			fwrite.close();
			System.out.println("Content is successfully written in a file");
		}
		catch(IOException e)
		{
			System.out.println("Unexpected error");
			e.printStackTrace();
		}


	}

}
