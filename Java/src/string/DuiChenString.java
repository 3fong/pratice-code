package string;
/*
 *判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * 分析：
 * 		方式一：
 * 			将字符串转成数组，通过首尾角标判断
 * 		方式二：
 * 			通过字符缓冲区判断，反转字符串等于原字符串就对称
 */
public class DuiChenString {

	public static void main(String[] args) {
		String s = "aacbcaa";
		boolean flag = method1(s);
		
		boolean flag1 = method2(s);
		System.out.println(flag1);
	}

	private static boolean method1(String s) {
		boolean flag = true;
		char[] chs = s.toCharArray();
		
		for(int x=0;x<chs.length/2;x++){
			if(chs[x]!=chs[chs.length-1-x]){
				return flag = false;
			}
		}
		return flag;
	}
	private static boolean method2(String s) {
//		StringBuilder sb = new StringBuilder();
//		sb.append(s);
//		String st = sb.reverse().toString();
//		return st.equals(s);
		return new StringBuilder(s).reverse().toString().equals(s);
	}
}
