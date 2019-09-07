package regex;
/*
 *替换功能
 *  	String类的public String replaceAll(String regex,String replacement)
 *  	使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
 */
public class ReplaceAllDemo {

	public static void main(String[] args) {
		String s = "helloqq12345worldkh622112345678java";
		
		String regex = "\\d+";
		String str = s.replaceAll(regex, "");
		
		System.out.println(str);
	}

}
