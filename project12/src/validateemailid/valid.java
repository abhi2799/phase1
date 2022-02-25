package validateemailid;
import java.util.regex.*;
import java.util.*;

public class valid {

	public static void main(String[] args) {
		ArrayList<String>emaili = new ArrayList<String> ();
		emaili.add("javaprogram@domain.co.in");
		emaili.add("javaprogram@domain.com");
		emaili.add("javaprogram#@domain.co.in");
		emaili.add("javaprogram.@domain.com");
		emaili.add("javaprogram@domain.co.in");
		emaili.add("javaprogram@domaincom");
		emaili.add("javaprogram#@yahoo.com");
		emaili.add("javaprogram#domain.com");
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		for(String email:emaili) {
			Matcher matcher = pattern.matcher(email);
			System.out.println(email +":"+ matcher.matches()+"\n");
			
		}

	}

}
