package regex;
/*
 *�滻����
 *  	String���public String replaceAll(String regex,String replacement)
 *  	ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ�����
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {
		String s = "helloqq12345worldkh622112345678java";
		
		String regex = "\\d+";
		String str = s.replaceAll(regex, "");
		
		System.out.println(str);
	}

}
