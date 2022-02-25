package filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;
import java.util.Scanner;
public class update {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\abhishek\\Desktop\\cre";
		Scanner sc = new Scanner(new File(filePath));
        StringBuffer buffer = new StringBuffer();
        while(sc.hasNextLine()) {
        	buffer.append(sc.nextLine()+System.lineSeparator());
        }
        String fileContents = buffer.toString();
        System.out.println("Contents of the file:"+fileContents);
        sc.close();
        String oldLine = "hello....!";
        String newLine = "hi everyone...!";
        fileContents = fileContents.replaceAll(oldLine, newLine);
        FileWriter Writer = new FileWriter(filePath);
        System.out.println("");
        System.out.println("new data:"+fileContents);
        Writer.append(fileContents);
        Writer.flush();
        
	}

}
