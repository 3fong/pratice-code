package stringBuffer;

import java.util.Scanner;

/*
 *判断一个字符串是否是对称字符串
 * 例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 * 分析：
 * 		方式一：
 * 		通过遍历字符串，通过首尾角标判断
 * 		需要将字符串转成字符数组
 * 		通过角标判断值
 * 		返回值类型为boolean
 * 		方式二：
 * 		通过StringBuffer的reverse()方法反转字符串，
 * 		对比反转值和原值，来判断是否对称。
 * 		参数列表：String 
 * 		返回值：boolean
 */
public class DuiChen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(duiChen(str));
		
		System.out.println(duiChen2(str));
	}
	//错误方法，虽然思路正确，但是代码只通过首尾角标值判断字符串是否对称 （这个方法可行，问题出在没有把赋值用return返回）
	public static boolean duiChen(String s){
		boolean flag= true;
		char[] chs = s.toCharArray();
		
		for(int x=0;x<chs.length/2;x++){
			if(chs[x]!=chs[chs.length-1-x]){
				flag=false;
				break;
			}
		}
		return flag;
	}
/*	public static boolean duiChen(String s){
		boolean flag = true;
		char[] chs = s.toCharArray();
		for(int start=0,end=chs.length-1;start<=end;start++,end--){
			if(chs[start]!=chs[end]){
				flag=false;
				break;
			}
		}
		return flag;
	}*/
	public static boolean duiChen2(String s){
		/*StringBuffer sb = new StringBuffer(s);
		if(sb.reverse().toString().equals(s)){
			return true;
		}
		return false;*/
		return new StringBuffer(s).reverse().toString().equals(s);
	}
}
