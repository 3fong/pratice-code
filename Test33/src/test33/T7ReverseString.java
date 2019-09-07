package test33;

import java.util.ArrayList;
import java.util.Collections;

/*
 *8、 将字符串中进行反转。abcde --> edcba
 *	分析：
 *		方法一：字符串反转，需要进行角标操作，用到数组
 *		方法二：StringBuilder reverese方法
 *		方法三：当然集合也可以，它的reverse方法很简便
 */
public class T7ReverseString {

	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(s);
		String s3 = myReverse3(s);
		System.out.println(s3);
		
		//方法四：StringBuilder直接转换
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}

	private static String myReverse1(String s) {
		char[] chs = s.toCharArray();
		for(int x =0;x<chs.length/2;x++){
			char temp = chs[x];
			chs[x]=chs[chs.length-1-x];
			chs[chs.length-1-x]=temp;
		}
		//数组转字符串valueOf(char[])、String(char[])构造方法。
		return String.valueOf(chs);
	}
	private static String myReverse2(String s) {
		StringBuilder sb = new StringBuilder();
		char[] chs = s.toCharArray();
		for(char c : chs){
			sb.append(c);
		}
		return sb.reverse().toString();
	}
	private static String myReverse3(String s) {
		ArrayList<Character> al = new ArrayList<Character>();
		char[] chs = s.toCharArray();
		
		for(char c : chs){
			al.add(c);
		}
		Collections.reverse(al);
		String str = "";
		for(Character c : al){
			str+=c;
		}
		return str;
	}
}
