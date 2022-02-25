package project22;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class ReadFile {
	public static void main(String args[]) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\abhishek\\Desktop\\filehandle.txt");
		int i;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();
		
		
			}

}

