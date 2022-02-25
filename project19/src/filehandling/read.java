package filehandling;
import java.io.FileReader;
public class read {
	public static void main(String args[]) throws Exception {
		FileReader fr=new FileReader("C:\\Users\\abhishek\\Desktop\\cre");
		int i;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();
	}

}
