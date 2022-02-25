package stringbuffer;

public class stringbuilder {

public static void StrConcat(String str1)
{
	str1=str1+"abhi";
}
public static void StrBuffConcat(StringBuffer str2) {
	str2.append("Abhisek");
}

public static void StrBuildConcat(StringBuilder str3) {
	str3.append("Abhi");
}

public static void main (String[] args) {
	String str1 ="Hello!!";
	StrConcat(str1);
	System.out.println("The final String is -" + str1);
	
	StringBuffer str2 = new StringBuffer("Hello..");
	StrBuffConcat(str2);
	System.out.println("The final String is-" +str2);
	
	StringBuilder str3 = new StringBuilder("hello!");
	StrBuildConcat(str3);
	System.out.println("The final String is-" +str3);
	
}
}
