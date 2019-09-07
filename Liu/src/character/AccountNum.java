package character;
/*
 *Character类：
	boolean isUpperCase(char ch):判断给定的字符是否是大写字符
	boolean isLowerCase(char ch):判断给定的字符是否是小写字符
	boolean isDigit(char ch):判断给定的字符是否是数字字符
	char toUpperCase(char ch):把给定的字符转换为大写字符
	char toLowerCase(char ch):把给定的字符转换为小写字符
	需求：统计字符串中大小写、数字的个数
 */
public class AccountNum {

	public static void main(String[] args) {
		String s = "ljfalHAFL4456";
		getNum2(s);
	}
	public static void getNum(String s){
		int upper = 0;
		int lower = 0;
		int num = 0;
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length;x++){
			if(chs[x]>='a'&&chs[x]<='z'){
				lower++;
			}
			else if(chs[x]>='A'&&chs[x]<='Z'){
				upper++;
			}
			else if(chs[x]>='0'&&chs[x]<='9'){
				num++;
			}
		}
		System.out.println("大写："+upper+"小写："+lower+"数字："+num);
	}
	public static void getNum2(String s){
		int upper = 0;
		int lower = 0;
		int num = 0;
		for(int x=0;x<s.length();x++){
			char ch = s.charAt(x);
			if(Character.isLowerCase(ch)){
				lower++;
			}
			else if(Character.isUpperCase(ch)){
				upper++;
			}
			else if(Character.isDigit(ch)){
				num++;
			}
		}
		System.out.println("大写："+upper+"小写："+lower+"数字："+num);
	}
}
