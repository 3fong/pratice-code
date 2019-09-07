package string;

import java.util.Scanner;

/*
 * 字符串反转
 * 举例：键盘录入”abc”		
 * 输出结果：”cba”
 * 分析：
 * 		转换成字符数组，进行位置交换
 * 		倒着将录入值存入数组
 */
public class ReveseString {

	public static void main(String[] args) {
		reveseDemo2();
	}
	public static void reveseDemo(){
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		char[] chs = str.toCharArray();
		for(int start=0,end=chs.length-1;start<end;start++,end--){
			char temp = chs[start];
			chs[start]=chs[end];
			chs[end]=temp;
		}
		System.out.println(chs);
	}
	/*
	 *  A:键盘录入一个字符串
 * 		B:定义一个新字符串
 * 		C:倒着遍历字符串，得到每一个字符
 * 			b:把字符串转成字符数组
 * 		D:用新字符串把每一个字符拼接起来
 * 		E:输出新串
	 */
	public static void reveseDemo2(){
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		char[] chs = str.toCharArray();
		String result = "";
		for(int x=chs.length-1;x>=0;x--){
			result+=chs[x];
		}
		System.out.println(result);
	}
}
