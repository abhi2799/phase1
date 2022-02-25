package project22;
import java.io.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.Writer;
import java.io.Reader;
import java.io.Scanner;
public class AppendFile {
	public static void appendStrToFile(String fileName, String str) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName,true));
			out.write(str);
			out.close();
		} catch(IOException e) {
			System.out.println("exception occured" +e);
		}
	}
	public static void main(String[] args) throws Exception {
		String fileName ="C:\\Users\\abhishek\\Desktop\\filehandle.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Hello World...!\n");
			out.close();
		} catch(IOException e) {
			System.out.println("Exception Occured" +e);
		}
		String str="This is Java Programming..."
				+ "";
		appendStrToFile(fileName,str);
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\abhishek\\Desktop\\filehandle.txt"));
			String mystring;
			while((mystring = in.readLine()) != null) {
				System.out.println(mystring);
			}
		} catch (IOException e) {
			System.out.println("Exception Occured" +e);
		}
	}
}