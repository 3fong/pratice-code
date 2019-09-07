package string;
/*Character类：
	boolean isUpperCase(char ch):判断给定的字符是否是大写字符
	boolean isLowerCase(char ch):判断给定的字符是否是小写字符
	boolean isDigit(char ch):判断给定的字符是否是数字字符
	char toUpperCase(char ch):把给定的字符转换为大写字符
	char toLowerCase(char ch):把给定的字符转换为小写字符
 *需求：获取各类字符出现的次数
 */
public class GetNumDemo {

	public static void main(String[] args) {
		String s = "ajAJ=FA4-=4546";
		getNum(s);
	}

	private static void getNum(String s) {
		int numD =0;
		int numL =0;
		int numU =0;
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length;x++){
			if(Character.isDigit(chs[x]))
				numD++;
			else if(Character.isLowerCase(chs[x]))
				numL++;
			else if(Character.isUpperCase(chs[x]))
				numU++;
		}
		System.out.println("数字个数是："+numD);
		System.out.println("小写字符个数是："+numL);
		System.out.println("大写字符个数是："+numU);
	}

}
