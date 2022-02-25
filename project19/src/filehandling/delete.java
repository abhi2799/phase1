package filehandling;
import java.io.File;
public class delete {

	public static void main(String[] args) {
		try 
		{
			File f= new File("C:\\Users\\abhishek\\Desktop\\cre");
			if(f.delete()) {
			System.out.println(f.getName()+ "-deleted successfully");	
			}
			else {
				System.out.println("file deletion failed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
