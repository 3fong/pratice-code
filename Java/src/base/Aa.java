package base;

public class Aa {
public static void main(String[] args) {
	System.out.println("hello"+'a'+1);
	System.out.println('a'+1+"hello");
	System.out.println("5+5="+5+5);
	System.out.println(5+5+"=5+5");
	
	String str1 = "abc";
	String str2 = "abc";
	str2 ="bc";
	System.out.println(str1==str2);
}
}
