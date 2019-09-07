package test33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *题目：编写程序，循环接收用户从键盘输入多个字符串，
 * 直到输入“end”时循环结束，并将所有已输入的字符串按字典顺序倒序打印。
 * 分析：
 * 		存储字符串，并倒序打印，没有对应关系，用TreeSet
 * 		方法一：直接接收一个反转比较器
 * 		方法二：转成list集合，用reverse方法。
 */
public class T15ReverseDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		
		while(true){
			String str = s.nextLine();
			if(str.equals("end"))
				break;
			ts.add(str);
		}
		
//		for(String st : ts){
//			System.out.println(st);
//		}
		printString1(ts);
	}

	private static void printString1(TreeSet<String> ts) {
		List<String> list = new ArrayList<String>();
		
		list.addAll(ts);
		
		Collections.reverse(list);
		for(String st : list){
			System.out.println(st);
		}
	}
}
