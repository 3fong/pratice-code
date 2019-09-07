package stringBuffer;

/*
 * ·´×ª×Ö·û´®
 */
public class ReverseString {

	public static void main(String[] args) {
		String s = "hellogirl";
		String str = myReverse(s);
		System.out.println(str);
		
		String str2 = reverse(s);
		System.out.println(str2);
	}
	public static String myReverse(String s) {
		char[] chs = s.toCharArray();
		String str = "";
		for (int x =chs.length - 1; x >= 0; x--) {
			str += chs[x];
		}
		return str;
	}
	public static String reverse(String s){		
		return new StringBuffer(s).reverse().toString();
	}
}
